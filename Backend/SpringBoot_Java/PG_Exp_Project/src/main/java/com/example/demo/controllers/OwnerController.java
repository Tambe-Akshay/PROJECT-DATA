package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Occupant;
import com.example.demo.entities.OccupantReg;
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerReg;
import com.example.demo.entities.Roles;
import com.example.demo.entities.Users;
import com.example.demo.services.OwnerService;
import com.example.demo.services.RolesService;
import com.example.demo.services.UsersService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OwnerController {

	@Autowired
	OwnerService owner_service;
	@Autowired
	RolesService roles_service;
	@Autowired
	UsersService users_service;
	
	 @PostMapping("/saveOwner")
	    public Owner saveOccupant(@RequestBody OwnerReg ownReg) 
	    {
		   System.out.println(ownReg.toString());
	       Roles r = roles_service.getRole(2);
	  
	       Users l= new Users(ownReg.getOwner_email(),ownReg.getOwner_password(),0,r);
	       Users saved = users_service.save(l);
	       
	       Owner o = new Owner(ownReg.getOwner_fname(),ownReg.getOwner_lname(),ownReg.getOwner_email(),ownReg.getContact(),ownReg.getOwner_aadhar(),ownReg.getOwner_address());
	       return owner_service.saveOccupant(o);
	    
	    }
}
