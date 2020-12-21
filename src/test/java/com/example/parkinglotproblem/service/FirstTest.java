package com.example.parkinglotproblem.service;

import com.example.parkinglotproblem.controller.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    public void addIntegers() {
        Controller controller=new Controller();
        assertEquals(controller.testString(), "ExampleTest Successfully complete");
    }

}
