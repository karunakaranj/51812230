package com.loan.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.loan.demo.constants.ManagerLevel;

@Entity
public class BankOfficer {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private ManagerLevel managerLevel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ManagerLevel getManagerLevel() {
		return managerLevel;
	}
	public void setManagerLevel(ManagerLevel managerLevel) {
		this.managerLevel = managerLevel;
	}
	
}
