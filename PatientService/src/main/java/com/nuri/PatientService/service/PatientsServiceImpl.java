package com.nuri.PatientService.service;

import com.nuri.PatientService.dto.PatientsDto;
import com.nuri.PatientService.dto.ScheduleDto;
import com.nuri.PatientService.exception.CustomException;
import com.nuri.PatientService.model.PatientsModel;
import com.nuri.PatientService.repository.PatientsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsServiceImpl implements PatientsService{

    @Autowired
    private PatientsRepo patientsRepo;
    @Autowired
    private APIClientForSchedule apiClientForSchedule;

    public void addPatients(PatientsDto patientsDto){
        PatientsModel patient = new PatientsModel(
                patientsDto.getId(),
                patientsDto.getName(),
                patientsDto.getEmail(),
                patientsDto.getAddress()
        );

        patientsRepo.save(patient);
    }

    public PatientsDto getPatientsInfo(Integer id) throws CustomException {
        PatientsModel patientsModel = patientsRepo.findById(id).orElseThrow(() -> new CustomException("No value found"));

        PatientsDto patientsDto = new PatientsDto(
                patientsModel.getId(),
                patientsModel.getName(),
                patientsModel.getEmail(),
                patientsModel.getAddress()
        );
        return patientsDto;
    }

    public void deletePatients(Integer id) throws CustomException {
        PatientsModel patient = patientsRepo.findById(id)
                .orElseThrow(() -> new CustomException("No value found here"));

        patientsRepo.deleteById(id);
    }

    public void updatePatients(Integer id, PatientsDto patientsDto) throws CustomException {
        PatientsModel existingPatient = patientsRepo.findById(id)
                .orElseThrow(() -> new CustomException("No value found here"));

        existingPatient.setName(patientsDto.getName());
        existingPatient.setEmail(patientsDto.getEmail());
        existingPatient.setAddress(patientsDto.getAddress());

        patientsRepo.save(existingPatient);
    }

    public List<ScheduleDto> getSchedule(Integer id) throws Exception{
        return apiClientForSchedule.getScheduleInfo(id);
    }
}
