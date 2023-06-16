package com.aseproject02.aseprojectattempt07.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aseproject02.aseprojectattempt07.entity.User;

@Repository
public interface UserServiceInterface extends JpaRepository<User,Long>{
	
}
