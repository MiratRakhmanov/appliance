package com.mirat.appliance.service;

import com.mirat.appliance.domain.Appliance;

public interface ApplianceService {

	<T extends Appliance> T findProduct(String request) throws ServiceException;

	boolean addNewProduct(String request) throws ServiceException;
}
