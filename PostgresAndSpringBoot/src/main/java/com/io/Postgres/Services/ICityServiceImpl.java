package com.io.Postgres.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.Postgres.dbModel.Cities;
import com.io.Postgres.repository.CityRepository;
@Service
public class ICityServiceImpl implements ICityService {

	@Autowired
	private CityRepository repository;
	
	
	public List<Cities> findAllCities()
	{
		List<Cities> cities = (List<Cities>) repository.findAll();
		return cities;
	
	}
	
}
