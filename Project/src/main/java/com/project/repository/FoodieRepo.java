package com.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.Foodie;

public interface FoodieRepo extends MongoRepository<Foodie,String> {

	Foodie findOne(int id);

	void delete(int id);

	void update(int id, Foodie foodie);
		

}
