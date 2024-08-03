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

import com.example.demo.models.home;
import com.example.demo.service.homeservice;


@RestController
@RequestMapping("/api/v1")

public class homecontroller {

	@Autowired
	homeservice hs;
	
	@PostMapping("/shome")
	public home insert(@RequestBody home h) {
		return hs.insert(h);
	}
	
	@PostMapping("/mhome")
	public Iterable<home> minsert(@RequestBody List<home> h) {
		return hs.minsert(h);
	}
	
	@GetMapping("/home/fetchall")
	public List<home> fetchall(){
		return hs.fetchall();
	}
	
	@GetMapping("/home/fetchnyid")
	public Optional<home> fetchbyid(@PathVariable int id) {
		return hs.fetchbyid(id);
	}
	
	@DeleteMapping("/home/del")
	public String del(@RequestBody int id) {
		return hs.del(id);
	}
	
	@PutMapping("/home/update")
	public home update(@RequestBody home h) {
		return hs.update(h);
	}
}
