package com.nuri.DepartmentService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Integer id;
    private String name;
    private String floorNo;
    private String departmentCode;
}
