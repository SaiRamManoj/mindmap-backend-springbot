package com.aseproject02.aseprojectattempt07.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.aseproject02.aseprojectattempt07.entity.Node;

@Service
public class NodeService implements NodeServiceInterface{
	
	@Autowired(required = true)
	private NodeServiceInterface nodeServiceInterface;
	
	@SuppressWarnings("unchecked")
	@Override
	public Node save(Node theNode) {
		System.out.println(theNode);
		return nodeServiceInterface.save(theNode);
	}
	
	public Long getNextId() {
		List<Node> nodes = this.findAll();
		if(nodes.isEmpty())
			return (long) 1;
		return nodes.get(nodes.size()-1).getId()+1;
	}
	
	@Override
	public List<Node> findAll(){
		return nodeServiceInterface.findAll();
	}

	@Override
	public  Optional<Node> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Node> result= nodeServiceInterface.findById(id);
		System.out.println(result.get().toString());
		return result;
	}
	
	
}
