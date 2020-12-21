package com.example.parkinglotproblem.controller;

import com.example.parkinglotproblem.parkingclass.CustomerInfo;
import com.example.parkinglotproblem.parkingclass.ParkingClass;
import com.example.parkinglotproblem.repository.CustomerInfoRepo;
import com.example.parkinglotproblem.repository.DatabaseOfParking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {
    @Autowired
    private CustomerInfoRepo customerInfo;
    @Autowired
    private DatabaseOfParking repository;
    //post method parking
    @PostMapping("/parking")
    public String saveParkingDetail(@RequestBody ParkingClass parking) {
        repository.save(parking);
        return "parking saved....";
    }
    //get methode of parking
    @GetMapping("/parking")
    public List<ParkingClass> getAllParking() {
        return repository.findAll();
    }
    //post Customer Info
    @PostMapping("/info")
    public String customerInfo(@RequestBody CustomerInfo customer) {
        customerInfo.save(customer);
        return "Customer Information saved..";
    }

    //get method info
   @GetMapping("/info")
    public List<CustomerInfo> getAllCustomerInfo() {
         return customerInfo.findAll();
   }

   //delete methode
   @DeleteMapping("/info/{vehicleNo}")
   public String getCustomerVehicleNo(@PathVariable Integer vehicleNo) {
         customerInfo.deleteById(vehicleNo);
         return "Successfully Customer  Information Deleted...  ";
   }

   // example methods for override process
    @Value("${my.greeting}")
    private  String string;
    @GetMapping("/hello")
    public String getString(){
        return string;
    }

    @Value("${my.greeting1}")
    private  String string1;
    @GetMapping("/hello1")
    public String getString1(){
        return string1;
    }

    public String testString(){
        return "ExampleTest Successfully completed";
    }
}
