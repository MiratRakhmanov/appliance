package com.mirat.appliance.controller.command;

import com.mirat.appliance.service.ServiceException;

public interface Command {

	String execute(String request) throws ServiceException;
}
