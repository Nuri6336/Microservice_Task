package com.nuri.DoctorService.controller;

import com.nuri.DoctorService.dto.APIResponseDto;
import com.nuri.DoctorService.dto.DoctorDto;
import com.nuri.DoctorService.dto.ScheduleDto;
import com.nuri.DoctorService.exception.CustomException;
import com.nuri.DoctorService.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public String saveDoctor(@RequestBody DoctorDto doctorDto) throws Exception{
        doctorService.addDoctor(doctorDto);
        return "Data has been saved";
    }

    @GetMapping("/view")
    public DoctorDto getDoctorInfo(@RequestParam Integer id) throws CustomException {
        return doctorService.getDoctorInfo(id);
    }

    @DeleteMapping("/delete")
    public String deleteDoctor(@RequestParam Integer id) throws CustomException {
        doctorService.deleteDoctor(id);
        return "Data has been deleted";
    }

    @PutMapping("/update")
    public String updateDoctor(@RequestParam Integer id,@RequestBody DoctorDto doctorDto) throws CustomException {
        doctorService.updateDoctor(id, doctorDto);
        return "Data has been updated";
    }

    @GetMapping("/view/department")
    public APIResponseDto getInfoWithDepartment(@RequestParam Integer id) throws Exception{
        return doctorService.getInfoWithDepartment(id);
    }

    @PostMapping("/add/schedule")
    public String addSchedule(@RequestBody ScheduleDto scheduleDto) throws Exception{
        doctorService.addSchedule(scheduleDto);
        return "Data has been saved";
    }

}
