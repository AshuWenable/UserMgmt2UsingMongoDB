package com.wenable.userManagement.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenable.userManagement.dto.UserDto;
import com.wenable.userManagement.model.User;
import com.wenable.userManagement.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
 private UserService usc; 

@GetMapping("/all")
public ResponseEntity<List<User>> getAllUser()
{
	return new ResponseEntity<List<User>>( usc.getAllUser(),HttpStatus.OK);
}

@GetMapping("/id/{id}")
public ResponseEntity<User>  getUserById(@PathVariable int id) throws Exception
{
	return new ResponseEntity<User>( usc.getUserById(id),HttpStatus.OK);
}


@PostMapping("/save")
public ResponseEntity<List<User>> saveAllUser(@RequestBody List<User> user)
{
	
	return new ResponseEntity<List<User>>(usc.saveUser(user),HttpStatus.OK);
}

@PutMapping("/update/{id}")
public ResponseEntity<User>  updateById(@PathVariable int id, @RequestBody User user) throws Exception 
{
	return new ResponseEntity<User> (usc.updateUserById(id, user),HttpStatus.OK);
}

@DeleteMapping("/remove/{id}")
public ResponseEntity<User> removeUser(@PathVariable int id) throws Exception
{
	return new ResponseEntity<User>(usc.removeUserById(id),HttpStatus.OK);
}
	


}
