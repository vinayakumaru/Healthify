package com.project.healthify.repository;

import com.project.healthify.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {
    @Query("SELECT a FROM Appointment a WHERE a.doctorID = :doctorId")
    List<Appointment> findByDoctorId(@Param("doctorId") String doctorId);

    @Query("SELECT a FROM Appointment a WHERE a.userID = :userID")
    List<Appointment> findByUserID(@Param("userID") String userID);
}
