package com.deepthi.departmentService.controller;

import com.deepthi.departmentService.entity.Department;
import com.deepthi.departmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

       @PostMapping("/")
       public Department save(@RequestBody Department department){
             log.info("inside save method of DepartmentController");
               return departmentService.save(department);
       }

        @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long deptId){
             return departmentService.findDepartmentByID(deptId);

        }


}
