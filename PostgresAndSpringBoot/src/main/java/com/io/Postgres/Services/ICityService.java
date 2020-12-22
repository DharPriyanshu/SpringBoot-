package com.io.Postgres.Services;

import java.util.List;

import com.io.Postgres.dbModel.Cities;

public interface ICityService {

	List<Cities> findAllCities();
	
}
