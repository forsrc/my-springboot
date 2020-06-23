package com.forsrc.springboot.entity;

import java.io.Serializable;


public class RolePk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6742714080763068577L;

	private String username;
	private String name;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
