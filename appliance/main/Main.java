package com.mirat.appliance.main;

import com.mirat.appliance.controller.Controller;
import com.mirat.appliance.service.ServiceException;
import com.mirat.appliance.view.View;

public class Main {

    public static void main(String[] args) throws ServiceException {
		String command;
		String response;
		Controller controller = new Controller();

		command = "login login=Mirat password=12345";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "addProduct Oven : BRAND=ATLANT, PRICE=250, POWER_CONSUMPTION=6000, WEIGHT=13, CAPACITY=34, DEPTH=70, HEIGHT=50, WIDTH=80";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct Oven HEIGHT=45.5";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct Refrigerator POWER_CONSUMPTION=100";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct VacuumCleaner MOTOR_SPEED_REGULATION=3000";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct Speaker CORD_LENGTH=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct Laptop BATTERY_CAPACITY=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();

		command = "findProduct TabletPC BATTERY_CAPACITY=3";
		response = controller.doAction(command);
		View.print(response);
		View.splitActions();
    }
}
