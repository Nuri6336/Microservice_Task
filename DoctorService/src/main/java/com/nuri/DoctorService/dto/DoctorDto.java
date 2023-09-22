package com.nuri.DoctorService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {

    private Integer id;
    private String name;
    private String email;
    private String address;
    private String departmentCode;
}
