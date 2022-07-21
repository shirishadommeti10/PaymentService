package com.shirisha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shirisha.entity.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}