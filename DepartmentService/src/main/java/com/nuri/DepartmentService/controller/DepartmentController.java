package com.nuri.DepartmentService.controller;

import com.nuri.DepartmentService.dto.DepartmentDto;
import com.nuri.DepartmentService.exception.CustomException;
import com.nuri.DepartmentService.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public String saveDepartment(@RequestBody DepartmentDto departmentDto) throws Exception{
        departmentService.addDepartment(departmentDto);
        return "Data has been saved";
    }

    @GetMapping("/view")
    public DepartmentDto getDepartmentInfo(@RequestParam String departmentCode) throws CustomException {
        return departmentService.getDepartmentInfo(departmentCode);
    }

    @DeleteMapping("/delete")
    public String deleteDepartment(@RequestParam Integer id) throws CustomException {
        departmentService.deleteDepartment(id);
        return "Data has been deleted";
    }

    @PutMapping("/update")
    public String updateDepartment(@RequestParam Integer id,@RequestBody DepartmentDto departmentDto) throws CustomException {
        departmentService.updateDepartment(id, departmentDto);
        return "Data has been updated";
    }


}
