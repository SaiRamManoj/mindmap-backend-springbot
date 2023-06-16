package com.aseproject02.aseprojectattempt07.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aseproject02.aseprojectattempt07.entity.User;
import com.aseproject02.aseprojectattempt07.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserRest {
	
	@Autowired(required = true)
	private UserService userService;
	
	
	@PostMapping("/users")
	public User addUser(@RequestBody User theUser) {
		System.out.println(theUser);
		return userService.save(theUser);
	}
	
	@PostMapping("/users/login")
	public User userLoginAuth(@RequestBody User theUser) {
		String userName = theUser.getUserName();
		String password=theUser.getUserPassword();
		List<User> users = userService.findAll();
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUserName().equalsIgnoreCase(theUser.getUserName()) 
					&& users.get(i).getUserPassword().equals(theUser.getUserPassword())) {
				return users.get(i);
			}
		}
		return null;
	}
	
}
