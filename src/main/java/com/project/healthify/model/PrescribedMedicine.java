package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
public class PrescribedMedicine implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String prescribedMedicineId;
    private String prescriptionId;
    private String medicineId;
    private int quantity;
    private String dosage;
    private String intake;

    public PrescribedMedicine() {
    }

    public PrescribedMedicine(String prescriptionId, String medicineId, int quantity, String dosage, String intake) {
        this.prescriptionId = prescriptionId;
        this.medicineId = medicineId;
        this.quantity = quantity;
        this.dosage = dosage;
        this.intake = intake;
    }

    public String getPrescribedMedicineId() {
        return prescribedMedicineId;
    }

    public void setPrescribedMedicineId(String prescribedMedicineId) {
        this.prescribedMedicineId = prescribedMedicineId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }
}
