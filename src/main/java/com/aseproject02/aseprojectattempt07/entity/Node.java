package com.aseproject02.aseprojectattempt07.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nodes")
public class Node {

	@jakarta.persistence.Id
	private Long Id;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="level")
	private Long Level;
	
	@Column(name="rootid")
	private Long RootId;
	
	@Column(name="parentid")
	private Long ParentId;
	
	@Column(name="comment")
	private String Comment;
	
	Node(){
		
	}

	public Node(Long id, String name, Long level, Long rootId, Long parentId, String comment) {
		super();
		Id = id;
		Name = name;
		Level = level;
		RootId = rootId;
		ParentId = parentId;
		Comment = comment;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Long getLevel() {
		return Level;
	}

	public void setLevel(Long level) {
		Level = level;
	}

	public Long getRootId() {
		return RootId;
	}

	public void setRootId(Long rootId) {
		RootId = rootId;
	}

	public Long getParentId() {
		return ParentId;
	}

	public void setParentId(Long parentId) {
		ParentId = parentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	@Override
	public String toString() {
		return "Node [Id=" + Id + ", Name=" + Name + ", Level=" + Level + ", RootId=" + RootId + ", ParentId="
				+ ParentId + ", Comment=" + Comment + "]";
	}
	
	
}
