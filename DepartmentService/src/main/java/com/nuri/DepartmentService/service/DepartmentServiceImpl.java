package com.nuri.DepartmentService.service;

import com.nuri.DepartmentService.dto.DepartmentDto;
import com.nuri.DepartmentService.exception.CustomException;
import com.nuri.DepartmentService.model.DepartmentModel;
import com.nuri.DepartmentService.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public void addDepartment(DepartmentDto departmentDto){
        DepartmentModel doctor = new DepartmentModel(
                departmentDto.getId(),
                departmentDto.getName(),
                departmentDto.getFloorNo(),
                departmentDto.getDepartmentCode()
        );

        departmentRepo.save(doctor);
    }

    public DepartmentDto getDepartmentInfo(String id) throws CustomException {
        DepartmentModel departmentModel = departmentRepo.findByDepartmentCode(id).orElseThrow(() -> new CustomException("No value found"));

        DepartmentDto departmentDto = new DepartmentDto(
                departmentModel.getId(),
                departmentModel.getName(),
                departmentModel.getFloorNo(),
                departmentModel.getDepartmentCode()
        );
        return departmentDto;
    }

    public void deleteDepartment(Integer id) throws CustomException {
        DepartmentModel departmentModel = departmentRepo.findById(id)
                .orElseThrow(() -> new CustomException("No value found here"));

        departmentRepo.deleteById(id);
    }

    public void updateDepartment(Integer id, DepartmentDto departmentDto) throws CustomException {
        DepartmentModel existingDepartment = departmentRepo.findById(id)
                .orElseThrow(() -> new CustomException("No value found here"));

        existingDepartment.setName(departmentDto.getName());
        existingDepartment.setFloorNo(departmentDto.getFloorNo());
        existingDepartment.setDepartmentCode(departmentDto.getDepartmentCode());

        departmentRepo.save(existingDepartment);
    }

}
