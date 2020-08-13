package org.iiitb.service;

import org.iiitb.bean.Employee;
import org.iiitb.dao.EmployeeDao;

import java.util.List;

public interface EmployeeService{
    EmployeeDao employeeDao = new EmployeeDao();
    List<Employee> findAllEmployeeByDeptId(int deptId);
    

}