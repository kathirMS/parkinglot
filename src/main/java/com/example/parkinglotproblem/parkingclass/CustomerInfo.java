package com.example.parkinglotproblem.parkingclass;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class CustomerInfo {
    @Id
    Integer vehicleNo;
    String name;
    Integer id;
    String vehicle;
}
