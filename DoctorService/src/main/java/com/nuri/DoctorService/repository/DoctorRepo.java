package com.nuri.DoctorService.repository;

import com.nuri.DoctorService.model.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<DoctorModel, Integer> {
}
