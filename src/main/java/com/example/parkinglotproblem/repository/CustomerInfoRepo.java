package com.example.parkinglotproblem.repository;

import com.example.parkinglotproblem.parkingclass.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepo extends JpaRepository<CustomerInfo,Integer> {
}