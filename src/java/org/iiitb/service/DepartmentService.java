package org.iiitb.service;

import org.iiitb.bean.Department;
import org.iiitb.dao.DepartmentDao;

import java.util.List;

public interface DepartmentService {
    DepartmentDao departmentDao = new DepartmentDao();

    void save(Department department);

    List<Department> findAll();
    Department findDepartmentById(int deptId);
    List<Department> findDepartmentByName(String deptName);

    void update(Department department,int newCapacity);
    void update(Department department,String newName);

    void delete(int deptId);
    void delete(String dName);

}