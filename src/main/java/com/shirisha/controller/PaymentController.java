package com.shirisha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shirisha.dto.PaymentDto;
import com.shirisha.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService pservice;
	@Autowired
	Environment environment;
	@PostMapping("/makepayment")
	public ResponseEntity<String> addData(@RequestBody PaymentDto pdto)
	{
		pservice.addData(pdto);
		String msg=environment.getProperty("API.SUCCESS");
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}

}

