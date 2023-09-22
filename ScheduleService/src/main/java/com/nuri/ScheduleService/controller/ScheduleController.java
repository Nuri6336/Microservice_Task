package com.nuri.ScheduleService.controller;

import com.nuri.ScheduleService.dto.ScheduleDto;
import com.nuri.ScheduleService.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/add")
    public String saveSchedule(@RequestBody ScheduleDto scheduleDto) throws Exception{
        scheduleService.addSchedule(scheduleDto);
        return "Data has been saved";
    }

    @GetMapping("/view")
    public List<ScheduleDto> getScheduleInfo(@RequestParam Integer id) throws Exception{
        return scheduleService.getAllSchedule(id);
    }
}
