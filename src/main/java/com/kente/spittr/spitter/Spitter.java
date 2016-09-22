package com.kente.spittr.spitter;

import javax.validation.constraints.NotNull;

public class Spitter
{
	@NotNull
	private String username;
	
	private String password;
	
	private String first_name;
	
	private String last_name;

	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}

	public String getFirst_name()
	{
		return first_name;
	}

	public String getLast_name()
	{
		return last_name;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void setFirst_name(String first_name)
	{
		this.first_name = first_name;
	}

	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}
}
