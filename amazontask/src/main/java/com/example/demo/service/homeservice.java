package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.home;
import com.example.demo.repository.homerepository;

@Service

public class homeservice {

	@Autowired
	homerepository hr;
	
	public home insert(home h) {
		return hr.save(h);
	}
	
	public Iterable<home> minsert(List<home> h) {
		return hr.saveAll(h);
	}
	
	public List<home> fetchall(){
		return (List<home>) hr.findAll();
	}
	
	public Optional<home> fetchbyid(int id) {
		return hr.findById(id);
	}
	
	public String del(int id) {
		hr.deleteById(id);
		return "successfully deleted: "+id;
	}
	
	public home update(home h) {
		int id = h.getId();
		home ho = hr.findById(id).get();
		ho.setUrl(h.getUrl());
		ho.setTitle(h.getTitle());
		return hr.save(ho);
	}
}
