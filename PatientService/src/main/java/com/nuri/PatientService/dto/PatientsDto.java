package com.nuri.PatientService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientsDto {

    private Integer id;
    private String name;
    private String email;
    private String address;
}
