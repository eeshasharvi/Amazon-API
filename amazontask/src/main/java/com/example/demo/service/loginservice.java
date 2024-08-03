package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.login;
import com.example.demo.repository.loginrepository;

@Service

public class loginservice {

	@Autowired
	loginrepository lr;
	
	public login slogin(login l) {
		return lr.save(l);
	}
	
	public Iterable<login> mlogin(List<login> l) {
		return lr.saveAll(l);
	}
	
	public List<login> mfetch(){
		return (List<login>) lr.findAll();
	}
	
	public String sfetch(String email,String password) {
		lr.findByEmailandPassword(email, password);
		return "logined successfully: "+email;
	}
	
	public String delbyid(int id) {
		lr.deleteById(id);
		return "successfully deleted : "+id;
	}
	
	public login update(login l) {
		int id = l.getId();
		login lo = lr.findById(id).get();
		lo.setEmail(l.getEmail());
		lo.setPassword(l.getPassword());
		return lr.save(lo);
	}

}
