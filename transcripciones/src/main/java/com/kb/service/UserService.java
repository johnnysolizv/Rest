package com.kb.service;

import com.kb.dao.UserDAO;
import com.kb.model.User;

public class UserService {
	UserDAO userDao = new UserDAO();

	public User getUserForId(String ID) {
		User user = userDao.getUserForID(ID);
		return user;
	}

	public String createUser(User user) {
		String userResponse = userDao.createUser(user);
		return userResponse;
	}


}
