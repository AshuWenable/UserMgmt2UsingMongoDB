package com.wenable.userManagement.dao;

import java.util.List;

import com.wenable.userManagement.model.User;

public interface IUserDaoInterface {
	public List<User> getAllUser();
	public List<User> saveUser(List<User> user);
	public User updateUserById(int id,User user) throws Exception ;
	public User getUserById(int id) throws Exception;
	public User removeUserById(int id)throws Exception ;

}
