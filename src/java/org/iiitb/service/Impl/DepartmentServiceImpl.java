package org.iiitb.service.Impl;

import org.iiitb.bean.Department;
import org.iiitb.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {


    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    @Override
    public Department findDepartmentById(int deptId){
        return departmentDao.findDepartmentById(deptId);
    }


    public List<Department> findDepartmentByName(String dName)
    {
        return departmentDao.findDepartmentByName(dName);
    }

    @Override
    public void delete(int deptId){}
    @Override
    public void delete(String dName){}

    @Override
    public void update(Department department, int newCapacity){department.setdCapacity(newCapacity); }

    @Override
    public void update(Department department, String newName) {department.setdName(newName);}
}