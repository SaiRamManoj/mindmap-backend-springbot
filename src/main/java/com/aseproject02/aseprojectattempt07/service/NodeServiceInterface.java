package com.aseproject02.aseprojectattempt07.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aseproject02.aseprojectattempt07.entity.Node;

@Repository
public interface NodeServiceInterface extends JpaRepository<Node, Long> {
	
}
