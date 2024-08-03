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

import com.example.demo.models.orderpage;
import com.example.demo.service.orderpageservice;

@RestController
@RequestMapping("/api/v1")
public class orderpagecontroller {

	@Autowired
	orderpageservice os;
	
	@PostMapping("/sorder")
	public orderpage order(@RequestBody orderpage o) {
		return os.order(o);
	}
	
	@PostMapping("/morders")
	public Iterable<orderpage> orders(@RequestBody List<orderpage> o) {
		return os.orders(o);
	}
	
	@GetMapping("/getall")
	public Iterable<orderpage> getall() {
		return os.getall();
	}
	
	@GetMapping("/getbyid")
	public Optional<orderpage> getbyid(@PathVariable int id) {
		return os.getbyid(id);
	}
	
	@DeleteMapping("/order/del")
	public String del(@RequestBody int id) {
		return os.del(id);
	}
	
	@PutMapping
	public orderpage update(@RequestBody orderpage op) {
		return os.update(op);
	}
}
