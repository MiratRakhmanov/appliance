package com.mirat.appliance.service.impl;

import com.mirat.appliance.dao.ApplianceDao;
import com.mirat.appliance.dao.DaoException;
import com.mirat.appliance.dao.DaoProvider;
import com.mirat.appliance.domain.Appliance;
import com.mirat.appliance.domain.electronic.portable.Laptop;
import com.mirat.appliance.domain.electronic.portable.TabletPC;
import com.mirat.appliance.domain.major.cleaning.VacuumCleaner;
import com.mirat.appliance.domain.major.kitchen.Oven;
import com.mirat.appliance.domain.major.kitchen.Refrigerator;
import com.mirat.appliance.domain.major.sound.Range;
import com.mirat.appliance.domain.major.sound.Speaker;
import com.mirat.appliance.service.ApplianceService;
import com.mirat.appliance.service.ServiceException;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    private static final String SINGLE_OR_MORE_WHITESPACES = "\\s+";
    private static final String EQUAL_SIGN = "=";
    private static final String HYPHEN = "-";

    @Override
    public <T extends Appliance> T findProduct(String request) throws ServiceException {
        String[] params = request.split(SINGLE_OR_MORE_WHITESPACES);
        String productName = params[1];
        String productSpecType = params[2].split(EQUAL_SIGN)[0];
        String productSpecValue = params[2].split(EQUAL_SIGN)[1];

        DaoProvider provider = DaoProvider.getInstance();
        ApplianceDao applianceDao = provider.getApplianceDao();
        List<String> data;
        try {
            data = applianceDao.searchForProduct(productName, productSpecType, productSpecValue);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        T obj = null;
        switch (productName) {
            case "Oven":
                obj = (T) new Oven(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), Double.parseDouble(data.get(6)), Double.parseDouble(data.get(7)));
                break;
            case "Refrigerator":
                obj = (T) new Refrigerator(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)), Double.parseDouble(data.get(5)), Integer.parseInt(data.get(6)), Integer.parseInt(data.get(7)));
                break;
            case "VacuumCleaner":
                obj = (T) new VacuumCleaner(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), data.get(3).charAt(0), data.get(4), data.get(5), Integer.parseInt(data.get(6)), Integer.parseInt(data.get(7)));
                break;
            case "Speaker":
                obj = (T) new Speaker(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)), getRange(data), Integer.parseInt(data.get(5)));
                break;
            case "Laptop":
                obj = (T) new Laptop(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), data.get(3), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), Double.parseDouble(data.get(6)), Double.parseDouble(data.get(7)));
                break;
            case "TabletPC":
                obj = (T) new TabletPC(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)), Double.parseDouble(data.get(3)), Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), data.get(6));
                break;
            default:
                break;
        }
        return obj;
    }

    @Override
    public boolean addNewProduct(String request) throws ServiceException {
        DaoProvider provider = DaoProvider.getInstance();
        ApplianceDao applianceDao = provider.getApplianceDao();
        boolean result;
        try {
            result = applianceDao.addProductToFile(request);
        } catch (DaoException | IOException e) {
            throw new ServiceException(e);
        }
        return result;
    }

    private Range getRange(List<String> data) {
        String[] r = data.get(4).split(HYPHEN);
        return new Range(Double.parseDouble(r[0]), Double.parseDouble(r[1]));
    }
}
