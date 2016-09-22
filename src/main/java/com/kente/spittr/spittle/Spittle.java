package com.kente.spittr.spittle;

import java.util.Date;

public class Spittle
{
	private Long id;
	
	private String message;
	
	private Date time;
	
	private Double latitude;
	
	private Double longitude;

	public Long getId()
	{
		return id;
	}

	public String getMessage()
	{
		return message;
	}

	public Date getTime()
	{
		return time;
	}

	public Double getLatitude()
	{
		return latitude;
	}

	public Double getLongitude()
	{
		return longitude;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}
}
