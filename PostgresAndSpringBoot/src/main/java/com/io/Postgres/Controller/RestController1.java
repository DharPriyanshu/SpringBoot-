package com.io.Postgres.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.io.Postgres.Services.ICityServiceImpl;
import com.io.Postgres.dbModel.Cities;
import com.io.Postgres.repository.CityRepository;


@Controller
public class RestController1 {

@Autowired
CityRepository repository;

@Autowired
private ICityServiceImpl cityService;

@GetMapping("/showCities")
public String findCities(Model model)
{
	List<Cities> cities = (List<Cities>) cityService.findAllCities();
	model.addAttribute("cities",cities);
	return "showCities";
}


}
