package com.nuri.DoctorService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {

    private DoctorDto doctorDto;
    private DepartmentDto departmentDto;
}
