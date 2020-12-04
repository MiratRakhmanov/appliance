package com.mirat.appliance.controller.command.impl;

import com.mirat.appliance.controller.command.Command;
import com.mirat.appliance.service.ApplianceService;
import com.mirat.appliance.service.ServiceException;
import com.mirat.appliance.service.ServiceProvider;

public class AddNewProductCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {
        ServiceProvider provider = ServiceProvider.getInstance();
        ApplianceService applianceService = provider.getApplianceService();

        boolean result = applianceService.addNewProduct(request);

        return result ?  "The product is added successfully." : "The product is already exist in the file.";
    }
}
