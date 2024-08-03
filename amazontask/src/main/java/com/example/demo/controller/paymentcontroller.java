package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.payment;
import com.example.demo.service.paymentservice;


@RestController
@RequestMapping("/api/v1")
public class paymentcontroller {

	@Autowired
	paymentservice ps;
	
	@PostMapping("/payment")
	public payment do_pay(@RequestBody payment p) {
		return ps.do_pay(p);
	}
	
}
