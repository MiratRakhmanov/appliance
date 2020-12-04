package com.mirat.appliance.service;

public interface UserService {

	boolean login(String login, String password) throws ServiceException;
}
