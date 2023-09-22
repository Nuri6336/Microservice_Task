package com.nuri.PatientService.service;

import com.nuri.PatientService.dto.PatientsDto;
import com.nuri.PatientService.dto.ScheduleDto;
import com.nuri.PatientService.exception.CustomException;

import java.util.List;

public interface PatientsService {

    void addPatients(PatientsDto doctorDto);

    PatientsDto getPatientsInfo(Integer id) throws CustomException;

    void updatePatients(Integer id, PatientsDto patientsDto) throws CustomException;
    void deletePatients(Integer id) throws CustomException;

    List<ScheduleDto> getSchedule(Integer id) throws Exception;
}
