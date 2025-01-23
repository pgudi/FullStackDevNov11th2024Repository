package com.gentech.dept.serviceimpl;

import com.gentech.dept.entity.Department;
import com.gentech.dept.repository.DepartmentRepository;
import com.gentech.dept.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentrepo;

    public DepartmentServiceImpl(DepartmentRepository departmentrepo) {
        this.departmentrepo = departmentrepo;
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentrepo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentrepo.findAll();
    }
}
