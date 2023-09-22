package com.nuri.ScheduleService.repository;

import com.nuri.ScheduleService.model.ScheduleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepo extends JpaRepository<ScheduleModel, Integer> {

    List<ScheduleModel> findByScheduleCode(Integer scheduleCode);
}
