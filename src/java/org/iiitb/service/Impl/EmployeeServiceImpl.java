package org.iiitb.service.Impl;
import org.iiitb.bean.Employee;
import org.iiitb.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> findAllEmployeeByDeptId(int id) {


        return employeeDao.findAllEmployeeByDeptId(id);

    }
}