package com.gentech.dept.controller;

import com.gentech.dept.entity.Department;
import com.gentech.dept.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/department")
    public ResponseEntity<Department> savedepartment(@RequestBody Department department)
    {
        Department savedDepartment=departmentService.createDepartment(department);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> displayAllDepartments()
    {
        return new ResponseEntity<>(departmentService.getAllDepartments(),HttpStatus.OK);
    }
}
