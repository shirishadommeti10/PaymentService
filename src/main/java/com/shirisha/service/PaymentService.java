package com.shirisha.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shirisha.dto.PaymentDto;
import com.shirisha.entity.Payment;
import com.shirisha.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
PaymentRepository prepo;
	public void addData(PaymentDto pdto)
	{
		Payment pay=new Payment();
		pay.setPaymentid(pdto.getPaymentid());
		pay.setTransactionid(UUID.randomUUID().toString());
		pay.setPaymentstatus(pdto.getPaymentstatus());
		prepo.save(pay);
	}
}

