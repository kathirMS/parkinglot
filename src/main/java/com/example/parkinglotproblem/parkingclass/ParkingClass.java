package com.example.parkinglotproblem.parkingclass;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class ParkingClass {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer car;
    private Integer bike;
    private Integer vane;

}

