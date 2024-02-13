package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Occupant;
import com.example.demo.entities.OccupantReg;
import com.example.demo.entities.Roles;
import com.example.demo.entities.Users;
import com.example.demo.services.OccupantService;
import com.example.demo.services.RolesService;
import com.example.demo.services.UsersService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class OccupantController {
	@Autowired
	OccupantService occupant_service;
	@Autowired
	UsersService user_service;
	@Autowired
	RolesService roles_service;
	
		@GetMapping("/getAllOccupants")
	    public List<Occupant> getAllOccupants() 
		{
	        return occupant_service.getAllOccupants();
	    }
	    @PostMapping("/saveOccupant")
	    public Occupant saveOccupant(@RequestBody OccupantReg occReg) 
	    {
	    	System.out.println(occReg.toString());
	       Roles r = roles_service.getRole(3);
	       Users l = new Users(occReg.getOccupant_email(),occReg.getOccupant_password(),0,r);
	       Users saved = user_service.save(l);
	       System.out.println(l.toString());
	       
	       
	       Occupant o = new Occupant(occReg.getOccupant_fname(),occReg.getOccupant_lname(),occReg.getOccupant_email(),occReg.getOccupant_contact(),occReg.getOccupant_gender(),occReg.getOccupant_profession(),occReg.getOccupant_address(),occReg.getOccupant_aadhar(),occReg.getAlternate_contact());
	       System.err.println(o.toString());
	       return occupant_service.saveOccupant(o);
	    
	    }
}
