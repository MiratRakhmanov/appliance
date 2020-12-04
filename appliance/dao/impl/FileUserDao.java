package com.mirat.appliance.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.mirat.appliance.dao.DaoException;
import com.mirat.appliance.dao.UserDao;

public class FileUserDao implements UserDao {

	private static final String RESOURCES_USERS_TXT = "/resources/users.txt";
	private static final String USER_DIR = "user.dir";
	private static final String WHITESPACE_AND_EQUAL_SIGN = "[\\s=]";
	
	@Override
	public boolean authorization(String login, String password) throws DaoException {
		boolean flag = false;
		try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty(USER_DIR) + RESOURCES_USERS_TXT))) {
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				if (checkCredentials(currentLine, login, password)) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			throw new DaoException("Please check filename and path.", e);
		} catch (IOException e) {
			throw new DaoException("Please check file.", e);
		}
		return flag;
	}

	@Override
	public boolean checkCredentials(String currentLine, String login, String password) {
		boolean flag = false;
		String[] step = currentLine.split(WHITESPACE_AND_EQUAL_SIGN);
		if (step[0].equals(login) && step[1].equals(password)) {
			flag = true;
		}
		return flag;
	}
}
