package com.nuri.DepartmentService.repository;

import com.nuri.DepartmentService.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepo extends JpaRepository<DepartmentModel, Integer> {

    Optional<DepartmentModel> findByDepartmentCode(String departmentCode);
}
