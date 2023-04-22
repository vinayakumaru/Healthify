package com.project.healthify.repository;

import com.project.healthify.model.PrescribedMedicine;
import com.project.healthify.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescribedMedicineRepository extends JpaRepository<PrescribedMedicine, String> {
}
