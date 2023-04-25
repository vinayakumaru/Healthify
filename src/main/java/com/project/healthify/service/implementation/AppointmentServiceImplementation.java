package com.project.healthify.service.implementation;

import com.project.healthify.model.Appointment;
import com.project.healthify.repository.AppointmentRepository;
import com.project.healthify.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Appointment create(Appointment entity) {
        return  repository.save(entity);
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
        List<Object[]> objects = repository.findByDoctorId(id);
        List<Appointment> appointments = new ArrayList<>();
        for(Object[] object:objects){
            Appointment appointment = (Appointment) object[0];
            appointment.setUserName((String) object[1]);
            appointment.setUserAge((Integer) object[2]);
            appointments.add(appointment);
        }
        return appointments;
    }

    @Override
    public List<Appointment> getUserAppointment(String id) {
        List<Object[]> objects = repository.findByUserId(id);
        List<Appointment> appointments = new ArrayList<>();
        for(Object[] object:objects){
            Appointment appointment = (Appointment) object[0];
            appointment.setDoctorName((String) object[1]);
            appointment.setHospitalName((String) object[2]);
            appointment.setHospitalLocation((String) object[3]);
            appointments.add(appointment);
        }
        return appointments;
    }
}
