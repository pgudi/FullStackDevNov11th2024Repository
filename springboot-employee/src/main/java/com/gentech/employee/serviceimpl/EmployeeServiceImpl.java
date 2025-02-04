package com.gentech.employee.serviceimpl;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.entity.Employee;
import com.gentech.employee.mapper.EmployeeMapper;
import com.gentech.employee.repository.EmployeeRepository;
import com.gentech.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=repository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployee(Long id) {
        Employee employee=repository.findById(id).orElseThrow(() ->
                new RuntimeException("The Employee With id "+id+" has not found in the database!!!"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public EmployeeDto modifyEmployee(Long id, EmployeeDto employeeDto) {
        Employee employee=repository.findById(id).orElseThrow(() ->
                new RuntimeException("The Employee With id "+id+" has not found in the database!!!"));

        employee.setName(employeeDto.getName());
        employee.setJobName(employeeDto.getJobName());
        employee.setSalary(employeeDto.getSalary());
        employee.setCityName(employeeDto.getCityName());
        employee.setCountryName(employeeDto.getCountryName());

        Employee savedEmploee=repository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmploee);
    }
}
