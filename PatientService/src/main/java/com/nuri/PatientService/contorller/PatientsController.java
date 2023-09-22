package com.nuri.PatientService.contorller;

import com.nuri.PatientService.dto.PatientsDto;
import com.nuri.PatientService.dto.ScheduleDto;
import com.nuri.PatientService.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientsService patientsService;

    @PostMapping("/add")
    public String savePatients(@RequestBody PatientsDto patientsDto){
        patientsService.addPatients(patientsDto);
        return "Data has been saved";
    }

    @GetMapping("/view")
    public PatientsDto getPatientsInfo(@RequestParam Integer id) throws Exception{
        return patientsService.getPatientsInfo(id);
    }

    @DeleteMapping("/delete")
    public String deletePatients(@RequestParam Integer id) throws Exception {
        patientsService.deletePatients(id);
        return "Data has been deleted";
    }

    @PutMapping("/update")
    public String updatePatients(@RequestParam Integer id,@RequestBody PatientsDto patientsDto) throws Exception {
        patientsService.updatePatients(id, patientsDto);
        return "Data has been updated";
    }

    @GetMapping("/view/doctors")
    public List<ScheduleDto> getScheduleInfo(@RequestParam Integer id) throws Exception{
        return patientsService.getSchedule(id);
    }


}
