package com.mirat.appliance.controller.command.impl;

import com.mirat.appliance.controller.command.Command;
import com.mirat.appliance.service.ServiceException;
import com.mirat.appliance.service.ServiceProvider;
import com.mirat.appliance.service.UserService;

public class LoginCommand implements Command {

	private static final String SINGLE_OR_MORE_WHITESPACES = "\\s+";
	private static final String EQUAL_SIGN = "=";

	@Override
	public String execute(String request) throws ServiceException {
		String[] params = request.split(SINGLE_OR_MORE_WHITESPACES);
		String login = params[1].split(EQUAL_SIGN)[1];
		String password = params[2].split(EQUAL_SIGN)[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService = provider.getUserService();

		boolean result = userService.login(login, password);

		return result ? "Login successful." : "Please check username or password.";
	}
}
