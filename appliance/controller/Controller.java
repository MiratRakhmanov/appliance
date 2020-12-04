package com.mirat.appliance.controller;

import com.mirat.appliance.controller.command.Command;
import com.mirat.appliance.controller.command.CommandProvider;
import com.mirat.appliance.service.ServiceException;

public class Controller {

    private static final String SINGLE_OR_MORE_WHITESPACES = "\\s+";

    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) throws ServiceException {
        String commandName = request.split(SINGLE_OR_MORE_WHITESPACES, 2)[0];
        Command command = provider.takeCommand(commandName);
        return command.execute(request);
    }
}
