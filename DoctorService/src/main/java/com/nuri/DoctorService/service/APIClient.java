package com.nuri.DoctorService.service;

import com.nuri.DoctorService.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "localhost:8081" , value = "DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("/department/view")
    DepartmentDto getDepartmentInfo(@RequestParam String departmentCode) throws Exception;

}
