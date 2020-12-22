package com.io.Postgres.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.io.Postgres.dbModel.Cities;




@Repository
public interface CityRepository extends CrudRepository<Cities, Long> {

	
}