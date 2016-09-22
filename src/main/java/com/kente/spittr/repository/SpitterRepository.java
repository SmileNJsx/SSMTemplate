package com.kente.spittr.repository;

import java.util.ArrayList;
import java.util.List;

public class SpitterRepository
{
	@SuppressWarnings("serial")
	public static List<String> spitterRepository = new ArrayList<String>()
	{
		{
			spitterRepository.add("John");
		}
	};
}
