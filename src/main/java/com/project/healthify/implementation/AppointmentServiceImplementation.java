package com.project.healthify.implementation;

import com.project.healthify.model.Appointment;
import com.project.healthify.repository.AppointmentRepository;
import com.project.healthify.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImplementation implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> get(String id) {
        return appointmentRepository.findById(id);
    }

    @Override
    public void create(Appointment entity) {
        appointmentRepository.save(entity);
    }

    @Override
    public void save(Appointment entity) {
        appointmentRepository.save(entity);
    }

    @Override
    public void delete(String id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<Appointment> getDoctorAppointment(String id) {
        return appointmentRepository.findByDoctorId(id);
    }

    @Override
    public List<Appointment> getUserAppointment(String id) {
        return appointmentRepository.findByUserID(id);
    }
}
