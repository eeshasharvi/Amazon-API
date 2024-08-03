package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.register;
import com.example.demo.repository.registerrepository;

@Service

public class registerservice {

	@Autowired
	registerrepository rr;
	
	public register add_user(register r) {
		return rr.save(r);
	}
	
	public Iterable<register> add_users(List<register> reg) {
		return rr.saveAll(reg);
	}
	
	public List<register> fetch_all() {
		return (List<register>) rr.findAll();
	}
	
	public Optional<register> fetch_user(int id) {
		return rr.findById(id);
	}
	
	public String delbyid(int id) {
		rr.deleteById(id);
		return "Successfully deleted : "+id;
	}
	
	public register upd(register r) {
		int id = r.getId();
		register re = rr.findById(id).get();
		re.setEmail(re.getEmail());
		re.setPassword(re.getPassword());
		return rr.save(re);
	}
}
