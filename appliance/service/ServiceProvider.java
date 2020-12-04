package com.mirat.appliance.service;

import com.mirat.appliance.service.impl.ApplianceServiceImpl;
import com.mirat.appliance.service.impl.UserServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider INSTANCE = new ServiceProvider();
	private final UserService userService = new UserServiceImpl();
	private final ApplianceService applianceService = new ApplianceServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}

	public UserService getUserService() {
		return userService;
	}

	public ApplianceService getApplianceService() {
		return applianceService;
	}

}
