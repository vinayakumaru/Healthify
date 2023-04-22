package com.project.healthify.service.implementation;

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
    AppointmentRepository repository;
    @Override
    public List<Appointment> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Appointment> get(String id) {
        return repository.findById(id);
    }

    @Override
    public void create(Appointment entity) {
        repository.save(entity);
    }

    @Override
    public void save(Appointment entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Appointment> getDoctorAppointment(String id) {
        return repository.findByDoctorId(id);
    }

    @Override
    public List<Appointment> getUserAppointment(String id) {
        return repository.findByUserId(id);
    }
}
