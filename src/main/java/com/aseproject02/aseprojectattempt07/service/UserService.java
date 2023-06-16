package com.aseproject02.aseprojectattempt07.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.aseproject02.aseprojectattempt07.entity.User;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@Override
	public User save(User theUser) {
		return userServiceInterface.save(theUser);
	}
	
	@Override
	public List<User> findAll(){
		return userServiceInterface.findAll();
	}
	
}
