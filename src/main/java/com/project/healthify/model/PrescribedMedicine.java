package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PrescribedMedicine {
    @Id
    private String PrescriptionId;
    @Id
    private String MedicineId;
    private int Quantity;
    private String Dosage;
    private String Intake;

    public PrescribedMedicine() {
    }

    public PrescribedMedicine(String prescriptionId, String medicineId, int quantity, String dosage, String intake) {
        PrescriptionId = prescriptionId;
        MedicineId = medicineId;
        Quantity = quantity;
        Dosage = dosage;
        Intake = intake;
    }

    public String getPrescriptionId() {
        return PrescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        PrescriptionId = prescriptionId;
    }

    public String getMedicineId() {
        return MedicineId;
    }

    public void setMedicineId(String medicineId) {
        MedicineId = medicineId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getIntake() {
        return Intake;
    }

    public void setIntake(String intake) {
        Intake = intake;
    }
}
