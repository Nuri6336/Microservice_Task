package com.nuri.DoctorService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDto {

    private String day;
    private String time;
    private Integer scheduleCode;
}
