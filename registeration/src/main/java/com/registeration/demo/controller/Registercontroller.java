package com.registeration.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.registeration.demo.dalimp.RegisterDal;
import com.registeration.demo.model.Register;

@RestController
public class Registercontroller {

	@Autowired
	private RegisterDal l;

	@GetMapping("/register")
	public List<Register> firstPage() {
		return l.findAll();
	}

	@DeleteMapping("/register/{id}")
	public Register delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Register lo = l.findById(id);
		System.out.println(lo);
		if (l.delete(lo))
			return lo;
		else
			return null;
	}

	@PostMapping("/register")
	public Register create(@RequestBody Register user) {
		l.create(user);
		System.out.println(user + " insert");
		return user;
}
}
