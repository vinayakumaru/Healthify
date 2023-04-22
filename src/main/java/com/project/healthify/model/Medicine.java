package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String MedicineId;
    private String MedicineName;

    public Medicine() {
    }

    public Medicine(String medicineName) {
        MedicineName = medicineName;
    }

    public String getMedicineId() {
        return MedicineId;
    }

    public void setMedicineId(String medicineId) {
        MedicineId = medicineId;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }
}
