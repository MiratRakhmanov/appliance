package com.mirat.appliance.controller.command.impl;

import com.mirat.appliance.controller.command.Command;
import com.mirat.appliance.domain.Appliance;
import com.mirat.appliance.service.ApplianceService;
import com.mirat.appliance.service.ServiceException;
import com.mirat.appliance.service.ServiceProvider;

public class FindProductCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {
        ServiceProvider provider = ServiceProvider.getInstance();
        ApplianceService applianceService = provider.getApplianceService();

        Appliance product = applianceService.findProduct(request);
        String productRepresentation = product.toString();

        return !productRepresentation.isEmpty() ? productRepresentation : "Product is not found.";
    }
}
