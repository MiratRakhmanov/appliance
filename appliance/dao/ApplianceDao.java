package com.mirat.appliance.dao;

import java.io.IOException;
import java.util.List;

public interface ApplianceDao {

	List<String> searchForProduct(String productName, String productSpecType, String productSpecValue) throws DaoException;

	boolean addProductToFile(String request) throws DaoException, IOException;
}
