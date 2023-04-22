package com.project.healthify.repository;

import com.project.healthify.model.Hospital;
import com.project.healthify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, String> {
}
