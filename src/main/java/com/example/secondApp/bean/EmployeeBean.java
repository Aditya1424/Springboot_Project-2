package com.example.secondApp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName="Aditya Gupta";

    @Autowired
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: "+employeeName+", Department: "+department.getDepartmentName();
    }
}
