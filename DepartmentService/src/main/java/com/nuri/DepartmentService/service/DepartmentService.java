package com.nuri.DepartmentService.service;

import com.nuri.DepartmentService.dto.DepartmentDto;
import com.nuri.DepartmentService.exception.CustomException;

public interface DepartmentService {

    void addDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentInfo(String id) throws CustomException;

    void updateDepartment(Integer id, DepartmentDto departmentDto) throws CustomException;

    void deleteDepartment(Integer id) throws CustomException;
}
