package com.nuri.PatientService.repository;

import com.nuri.PatientService.model.PatientsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepo extends JpaRepository<PatientsModel, Integer> {
}
