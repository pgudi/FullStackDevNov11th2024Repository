package com.gentech.employee.service;

import com.gentech.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployee(Long id);
    EmployeeDto modifyEmployee(Long id,EmployeeDto employeeDto);
    List<EmployeeDto> getEmployeesByName(String name);
    List<EmployeeDto> getEmployeesByCityNameAndCountryName(String city,String country);

    List<EmployeeDto> getEmployeesBySalary(Integer salary);

    List<EmployeeDto> getEmployeesByJobNameKeyword(String jobkeyword);

    List<EmployeeDto> getAllEmployees(Integer pageNumber, Integer pageSize);
}
