package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Area;
import com.example.demo.repository.AreaRepository;

@Service
public class AreaService {
	@Autowired
	AreaRepository area_repo;
	
	
	/*public List<Area> getAreasByCity(int city_id) { 
        return area_repo.findByCityId(city_id); 
	}*/
}
