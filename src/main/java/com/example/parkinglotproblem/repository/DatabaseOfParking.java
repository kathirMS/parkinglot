package com.example.parkinglotproblem.repository;

import com.example.parkinglotproblem.parkingclass.ParkingClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseOfParking  extends JpaRepository<ParkingClass,Integer> {

}
