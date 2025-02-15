package com.gentech.dept.aop;

import com.gentech.dept.entity.Department;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class DepartmentAspect {

    @Before(value="execution(* com.gentech.dept.controller.DepartmentController.*(..))")
    public void beforeAdviceMethod(JoinPoint joinPoint)
    {
        System.out.println("In Controller Layer,The Execution of the Controller method "+joinPoint.getSignature()+" has started executing at "+new Date());
    }

    @After(value="execution(* com.gentech.dept.controller.DepartmentController.*(..))")
    public void afterAdviceMethod(JoinPoint joinPoint)
    {
        System.out.println("In Controller Layer,The Execution of the Controller method "+joinPoint.getSignature()+" has ended executing at "+new Date());
    }

    @Before(value="execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
    public void beforeAdviceMethodInService(JoinPoint joinPoint)
    {
        System.out.println("In Service Layer, The Execution of the Service method "+joinPoint.getSignature()+" has started executing at "+new Date());
    }

    @After(value="execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
    public void afterAdviceMethodInService(JoinPoint joinPoint)
    {
        System.out.println("In Service Layer,The Execution of the Service method "+joinPoint.getSignature()+" has ended executing at "+new Date());
    }

    @AfterReturning(value="execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.createDepartment(..))", returning="department")
    public void afterReturningAdviceMethodInService(JoinPoint joinPoint, Department department)
    {
        System.out.println("In Service Layer,The Creation of the Department has performed succesffuly so A new Id has Generated :"+department.getDeptId());
    }

    @AfterThrowing(value="execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.createDepartment(..))", throwing="exception")
    public void afterThrowingAdviceMethodInService(JoinPoint joinPoint, Exception exception)
    {
        System.out.println("an Exception has occurred duing creation of Department, The Exception details includes :"+exception.getMessage());
    }
}
