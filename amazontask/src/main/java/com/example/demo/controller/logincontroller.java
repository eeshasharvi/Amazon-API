package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.login;
import com.example.demo.service.loginservice;


@RestController
@RequestMapping("/api/v1")

public class logincontroller {

	@Autowired
	 loginservice ls;
	
	@PostMapping("/slogin")
	public login slogin(@RequestBody login l) {
		return ls.slogin(l);
	}
	
	@PostMapping("/mlogin")
	public Iterable<login> mlogin(@RequestBody List<login> l) {
		return ls.mlogin(l);
	}
	
	@GetMapping("/mfetch")
	public List<login> mfetch(){
		return ls.mfetch();
	}
	
	@GetMapping("/sfetch/{email}/{password}")
	public String sfetch(@PathVariable String email,String password) {
		return ls.sfetch(email, password);
		
	}
	
	@DeleteMapping("/del")
	public String delbyid(@RequestBody int id) {
		return ls.delbyid(id);
	}
	
	@PutMapping("/update")
	public login update(@RequestBody login l) {
		return ls.update(l);
	}
}
