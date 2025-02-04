package com.gentech.employee.service;

import com.gentech.employee.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployee(Long id);
    EmployeeDto modifyEmployee(Long id,EmployeeDto employeeDto);
}
