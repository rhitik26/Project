package com.registeration.demo.dalimp;

import java.util.List;

import com.registeration.demo.model.Register;

public interface RegisterDal {
	
	public Register create(Register l);
	
	public Boolean delete(Register l);
	
	public List<Register> findAll();
	
	public Register findById(String id);

}
