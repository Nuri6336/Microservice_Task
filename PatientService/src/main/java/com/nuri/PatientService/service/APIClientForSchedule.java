package com.nuri.PatientService.service;

import com.nuri.PatientService.dto.ScheduleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "localhost:8084" , value = "Schedule-SERVICE")
public interface APIClientForSchedule {

    @GetMapping("/schedule/view")
    List<ScheduleDto> getScheduleInfo(@RequestParam Integer id) throws Exception;
}
