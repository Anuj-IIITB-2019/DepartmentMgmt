package org.iiitb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.iiitb.bean.Department;
import org.iiitb.bean.Employee;
import org.iiitb.util.SessionUtil;

import java.util.List;
public class EmployeeDao{
    DepartmentDao departmentDao=new DepartmentDao();
    Employee employee = new Employee();
    Department department = new Department();
    public List<Employee> findAllEmployeeByDeptId(int deptId){
        DepartmentDao departmentDao= new DepartmentDao();
        department = departmentDao.findDepartmentById(deptId);

        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        String hql = "FROM employee WHERE empId = :id  ";
        Query query = session.createQuery(hql);
        query.setParameter("id",department.deptId);

        List<Employee> employeeList = query.list();

        transaction.commit();
        session.close();
        return employeeList;
    }


}