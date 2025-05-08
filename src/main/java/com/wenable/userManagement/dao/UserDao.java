package com.wenable.userManagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wenable.userManagement.customException.UserException;
import com.wenable.userManagement.model.User;
import com.wenable.userManagement.repo.IUserRepository;

@Component
public class UserDao implements IUserDaoInterface {

	@Autowired
	private IUserRepository userRepo;

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	public List<User> saveUser(List<User> user){
		return userRepo.saveAll(user);
	}
	@Override
	public User updateUserById(int id, User user) throws UserException{
		Optional<User> existingUser=userRepo.findById(id);
		if(!existingUser.isPresent())
		{
			throw new UserException("Invalid user ID");
		}
		if(user.getuId()==id)
		{
			return userRepo.save(user);
		}
		else
		{
			throw new UserException("Invalid user");
		}
		
		
	}

	@Override
	public User getUserById(int id) throws UserException {
	    Optional<User> existingUser = userRepo.findById(id);
	    
	    if (existingUser.isPresent()) {
	        return existingUser.get();
	    } else {
	        throw new UserException("User with ID " + id + " not found."); 
	    }
	}


	@Override
	public User removeUserById(int id) throws UserException {
		Optional<User> existingUser=userRepo.findById(id);
		if(existingUser.isPresent())
		{
			userRepo.deleteById(id);
			return existingUser.get();
		}
		else
		{
			throw new UserException("User with ID " + id + " not found."); 
		}
		
	}

	
	    
}
