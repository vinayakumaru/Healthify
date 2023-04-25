package com.project.healthify.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String appointmentId;
    private String userId;
    private String doctorId;
    private String status;
    private String date;

    @Transient
    private String doctorName;

    @Transient
    private String hospitalName;

    @Transient
    private String hospitalLocation;

    @Transient
    private String userName;

    @Transient
    private Integer userAge;

    public Appointment() {
    }

    public Appointment(String userId, String doctorId, String status, String date) {
        this.userId = userId;
        this.doctorId = doctorId;
        this.status = status;
        this.date = date;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }


}
