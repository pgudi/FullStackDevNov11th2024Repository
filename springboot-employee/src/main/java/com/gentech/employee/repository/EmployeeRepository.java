package com.gentech.employee.repository;

import com.gentech.employee.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, PagingAndSortingRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByCityNameAndCountryName(String cityname,String countryname);

    List<Employee> findBySalary(Integer salary);

    List<Employee> findByJobNameContaining(String keyword, Sort sort);

}