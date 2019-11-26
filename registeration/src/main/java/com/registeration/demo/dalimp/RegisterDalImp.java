package com.registeration.demo.dalimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.registeration.demo.model.Register;


@Repository
public class RegisterDalImp implements RegisterDal {
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Register create(Register l) {
		// TODO Auto-generated method stub
		return mongo.save(l);
	}

	@Override
	public Boolean delete(Register l) {
		// TODO Auto-generated method stub
		return mongo.remove(l).wasAcknowledged();
	}

	@Override
	public List<Register> findAll() {
		// TODO Auto-generutoated method stub
		return mongo.findAll(Register.class);
	}

	@Override
	public Register findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Register.class);
	}


}
