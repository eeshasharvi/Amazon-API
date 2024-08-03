package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.payment;
import com.example.demo.repository.paymentrepository;

@Service

public class paymentservice {

	@Autowired
	paymentrepository pr;
	
	public payment do_pay(payment p) {
		return pr.save(p);
	}
}
