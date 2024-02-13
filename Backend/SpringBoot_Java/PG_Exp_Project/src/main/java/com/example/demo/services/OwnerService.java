package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Occupant;
import com.example.demo.entities.Owner;
import com.example.demo.repository.OwnerRepository;

@Service
public class OwnerService {
	@Autowired
	OwnerRepository owner_repo;
	
	 public Owner saveOccupant(Owner o)
	    {
	    	return owner_repo.save(o);
	    }
	
}
