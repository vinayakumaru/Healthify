package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Prescription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String PrescriptionId;
    private String PatientId;
    private String DoctorId;
    private Date PrescribedDate;

    public Prescription() {
    }

    public Prescription(String patientId, String doctorId, Date prescribedDate) {
        PatientId = patientId;
        DoctorId = doctorId;
        PrescribedDate = prescribedDate;
    }

    public String getPrescriptionId() {
        return PrescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        PrescriptionId = prescriptionId;
    }

    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String patientId) {
        PatientId = patientId;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String doctorId) {
        DoctorId = doctorId;
    }

    public Date getPrescribedDate() {
        return PrescribedDate;
    }

    public void setPrescribedDate(Date prescribedDate) {
        PrescribedDate = prescribedDate;
    }
}
