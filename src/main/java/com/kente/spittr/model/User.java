package com.kente.spittr.model;

import org.springframework.stereotype.Component;

@Component
public class User
{
	private Long id;
	
	private String username;
	
	private int age;

	public Long getId()
	{
		return id;
	}

	public String getUsername()
	{
		return username;
	}

	public int getAge()
	{
		return age;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
