package com.gentech.dept.service;

import com.gentech.dept.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department createDepartment(Department department);
    List<Department> getAllDepartments();
}
