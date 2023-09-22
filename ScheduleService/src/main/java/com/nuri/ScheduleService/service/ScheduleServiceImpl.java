package com.nuri.ScheduleService.service;

import com.nuri.ScheduleService.dto.ScheduleDto;
import com.nuri.ScheduleService.model.ScheduleModel;
import com.nuri.ScheduleService.repository.ScheduleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    @Autowired
    private ScheduleRepo scheduleRepo;
    @Autowired
    private ModelMapper modelMapper;

    public void addSchedule(ScheduleDto scheduleDto) throws Exception{
        ScheduleModel scheduleModel = new ScheduleModel(
                scheduleDto.getId(),
                scheduleDto.getDay(),
                scheduleDto.getTime(),
                scheduleDto.getScheduleCode()
        );

        scheduleRepo.save(scheduleModel);
    }

    public List<ScheduleDto> getAllSchedule(Integer id) throws Exception{
        List<ScheduleModel> scheduleModel = scheduleRepo.findByScheduleCode(id);

        return scheduleModel.stream()
                .map(schedule -> modelMapper.map(schedule, ScheduleDto.class))
                .collect(Collectors.toList());
    }
}
