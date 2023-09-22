package com.nuri.DoctorService.service;

import com.nuri.DoctorService.dto.ScheduleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "localhost:8084" , value = "Schedule-SERVICE")
public interface APIClientForSchedule {

    @PostMapping("/schedule/add")
    String saveSchedule(@RequestBody ScheduleDto scheduleDto) throws Exception;
}
