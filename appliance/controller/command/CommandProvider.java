package com.mirat.appliance.controller.command;

import java.util.HashMap;
import java.util.Map;

import com.mirat.appliance.controller.command.impl.AddNewProductCommand;
import com.mirat.appliance.controller.command.impl.FindProductCommand;
import com.mirat.appliance.controller.command.impl.LoginCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("login", new LoginCommand());
		commands.put("findProduct", new FindProductCommand());
		commands.put("addProduct", new AddNewProductCommand());
	}
	
	public Command takeCommand(String commandName) {
		return commands.get(commandName);
	}
}
