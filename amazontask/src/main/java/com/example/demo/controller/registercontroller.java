package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.register;
import com.example.demo.service.registerservice;

@RestController
@RequestMapping("/api/v1")

public class registercontroller {

	@Autowired
	registerservice rs;
	
	@PostMapping("/register")
	public register add_user(@RequestBody register r) {
		return rs.add_user(r);
	}
	
	@PostMapping("/registration")
	public Iterable<register> add_users(@RequestBody List<register> reg) {
		return rs.add_users(reg);
	}
	
	@GetMapping("/fetchall")
	public List<register> fetch_all(){
		return (List<register>) rs.fetch_all();
	}
	
	@GetMapping("/fetchbyid/{id}")
	public Optional<register> fetch_user(@PathVariable int id) {
		return rs.fetch_user(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String delbyid(@RequestBody int id) {
		return rs.delbyid(id);
	}
	
	@PutMapping("/upd")
	public register upd(@RequestBody register r) {
		return rs.upd(r);
	}
}
