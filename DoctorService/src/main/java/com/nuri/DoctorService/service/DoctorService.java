package com.nuri.DoctorService.service;

import com.nuri.DoctorService.dto.APIResponseDto;
import com.nuri.DoctorService.dto.DoctorDto;
import com.nuri.DoctorService.dto.ScheduleDto;
import com.nuri.DoctorService.exception.CustomException;

public interface DoctorService {

    void addDoctor(DoctorDto doctorDto);

    DoctorDto getDoctorInfo(Integer id) throws CustomException;

    void updateDoctor(Integer id, DoctorDto doctorDto) throws CustomException;

    void deleteDoctor(Integer id) throws CustomException;

    APIResponseDto getInfoWithDepartment(Integer id) throws Exception;

    void addSchedule(ScheduleDto scheduleDto) throws Exception;
}
