package com.ngo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ngo.demo.model.Org;
import com.ngo.demo.repository.OrgRepo;


@RestController
public class OrgController {
	@Autowired
	OrgRepo orepo;
	
	@PostMapping("/org")
	public void createOrg(@RequestBody Org org) {
		orepo.insert(org);
	}
	
	
	@GetMapping("/org")
	public List<Org> findAllOrgs(){
		return  orepo.findAll();
	}
	
}
