package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.orderpage;
import com.example.demo.repository.orderpagerepository;

@Service

public class orderpageservice {

	@Autowired
	orderpagerepository or;
	
	public orderpage order(orderpage o) {
		return or.save(o);
	}
	
	public Iterable<orderpage> orders(List<orderpage> o) {
		return or.saveAll(o);
	}
	
	public List<orderpage> getall(){
		return (List<orderpage>) or.findAll();
	}
	
	public Optional<orderpage> getbyid(int id){
		return or.findById(id);
	}
	
	public String del(int id) {
		or.deleteById(id);
		return "successfully deleted: "+id;
	}
	
	public orderpage update(orderpage op) {
		int id = op.getId();
		orderpage o = or.findById(id).get();
		o.setName(op.getName());
		o.setEmail(op.getEmail());
		o.setPhno(op.getPhno());
		o.setAddress(op.getAddress());
		return or.save(o);
	}
	
}
