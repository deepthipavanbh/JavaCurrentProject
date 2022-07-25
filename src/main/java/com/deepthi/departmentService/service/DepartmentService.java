package com.deepthi.departmentService.service;

import com.deepthi.departmentService.entity.Department;
import com.deepthi.departmentService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
         @Autowired
         private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        log.info("inside save() of departmentService");
        return departmentRepository.save(department);
    }

    public List<Department> findAllDepartments() {
        log.info("inside findallDepartments() of DepartmentService");
           return departmentRepository.findAll();
    }

    public Department findDepartmentByID(Long deptId) {

          log.info("inside findDepartmentById() of DepartmentService");
    return departmentRepository.findByDepartmentId(deptId);

    }
}
