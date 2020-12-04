package com.mirat.appliance.service.impl;

import com.mirat.appliance.dao.DaoException;
import com.mirat.appliance.dao.DaoProvider;
import com.mirat.appliance.dao.UserDao;
import com.mirat.appliance.service.ServiceException;
import com.mirat.appliance.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String login, String password) throws ServiceException {
        boolean result;
        if (login == null || password == null || login.length() < 4 || password.length() < 5) {
            result = false;
        } else {
            DaoProvider provider = DaoProvider.getInstance();
            UserDao userDao = provider.getUserDao();
            try {
                result = userDao.authorization(login, password);
            } catch (DaoException e) {
                throw new ServiceException(e);
            }
        }
        return result;
    }
}
