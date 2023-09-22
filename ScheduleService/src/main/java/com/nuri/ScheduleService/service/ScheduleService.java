package com.nuri.ScheduleService.service;

import com.nuri.ScheduleService.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {

    void addSchedule(ScheduleDto scheduleDto) throws Exception;

    List<ScheduleDto> getAllSchedule(Integer id) throws Exception;
}
