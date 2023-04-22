package com.project.healthify.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.project.healthify.model.Appointment;
import com.project.healthify.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;
    @GetMapping("/user/{id}")
    public ResponseEntity<List<Appointment>> getAppointment(@PathVariable String id){
        List<Appointment> appointments = appointmentService.getUserAppointment(id);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<List<Appointment>> getAppointmentDoctor(@PathVariable String id){
        List<Appointment> appointments = appointmentService.getDoctorAppointment(id);
        return ResponseEntity.ok(appointments);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addAppointment(@RequestBody JsonNode payload){
        System.out.println(payload);
        return ResponseEntity.ok("Appointment added successfully");
    }

}
