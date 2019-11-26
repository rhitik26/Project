package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Foodie;
import com.project.repository.FoodieRepo;

@RestController
public class FoodieController {
	
	@Autowired
	FoodieRepo frepo;
	
	@PostMapping("/foodie")
	public void createFoodie(@RequestBody Foodie foodie) {
		frepo.insert(foodie);
	}
	
	@GetMapping("/foodie/{id}")
	public 	Foodie findFoodie(@PathVariable int id) {
		return frepo.findOne(id);
	}
	
	@GetMapping("/foodie")
	public List<Foodie> findAllFoodie(){
		return  frepo.findAll();
	}
	
	@DeleteMapping("/foodie/delete/{id}")
	public void deleteFoodie(@PathVariable int id) {
		frepo.delete(id);
	}
	
	@PutMapping("/foodie/{id}")
	public void updateFoodie(@PathVariable int id, @RequestBody Foodie foodie) {
		frepo.update(id,foodie);
	}
	
}
