package com.gentech.employee.controller;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(service.createEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Long id)
    {
        return new ResponseEntity<>(service.getEmployee(id), HttpStatus.OK);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable Long id,
                                                      @RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(service.modifyEmployee(id, employeeDto), HttpStatus.OK);
    }
}
