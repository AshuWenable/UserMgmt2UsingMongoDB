package com.wenable.userManagement.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wenable.userManagement.customException.UserException;
import com.wenable.userManagement.dao.UserDao;
import com.wenable.userManagement.dto.UserDto;
import com.wenable.userManagement.model.User;

@Component
public class UserService {
	
	@Autowired
	private UserDao ud;
	
	public List<User>getAllUser()
	{
		return ud.getAllUser();
	}
	
	public List<User> saveUser(List<User> user) {
		return ud.saveUser(user);
	}
	
	public User updateUserById(int id,User user) throws Exception 
	{
		return ud.updateUserById(id, user);
	}
	
	public User getUserById(int id) throws Exception
	{
		return ud.getUserById(id);
	}
	
	public User removeUserById(int id)throws Exception
	{
		return ud.removeUserById(id);
	}
	

	



}

