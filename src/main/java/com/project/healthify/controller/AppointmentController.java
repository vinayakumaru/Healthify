package com.project.healthify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @GetMapping("/user/{id}")
    public ResponseEntity<String> getAppointment(@PathVariable String id){

        return null;
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<String> getAppointmentDoctor(@PathVariable String id){

        return null;
    }
}
