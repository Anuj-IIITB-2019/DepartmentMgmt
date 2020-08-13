package org.iiitb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.iiitb.bean.Department;
import org.iiitb.util.SessionUtil;

import java.util.List;

public class DepartmentDao{
    Department department =  new Department();
    public void save(Department dept)
    {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        session.save(dept);

        transaction.commit();
        session.close();
    }

    public Department findByName(String Name) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        String hql = "FROM department WHERE dName = :Name";
        Query query = session.createQuery(hql);

        Department dept = (Department) query.getSingleResult();

        transaction.commit();
        session.close();
        return dept;
    }




    public List<Department> findAll() {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM department ");

        List<Department> departments = query.list();

        transaction.commit();
        session.close();

        return departments;
    }

    public Department findDepartmentById(int id)
    {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();


        String hql = "FROM department WHERE deptSurrogate= :id ";
        Query<Department> query = session.createQuery(hql);
        query.setParameter("id",id);
        department = query.getSingleResult();

        transaction.commit();
        session.close();

        return department;
    }


    public List<Department> findDepartmentByName(String dName)
    {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        String hql = "FROM department WHERE deptName= :deptName ";
        Query query = session.createQuery(hql);
        query.setParameter("deptName",dName);
        //   List<Employee> employees = query.list();
        List<Department> departments = query.list();

        transaction.commit();
        session.close();

        return departments;
    }

    public void delete(Department dept) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("Delete employee where department = dept ");
        transaction.commit();
        session.close();
    }

    void update(Department department,int capacity) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        department.setdCapacity(capacity);

        session.save(department);

        transaction.commit();
        session.close();
    }
    void update(Department department,String newName){

        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();

        department.setdName(newName);

        session.save(department);

        transaction.commit();
        session.close();
    }


//    public List<Employee> findAllEmployeeById(Department department) {
//        Session session = SessionUtil.getSession();
//        Transaction transaction = session.beginTransaction();
//
//        String hql = "FROM department WHERE deptSurrogate= :dept ";
//        Query query = session.createQuery(hql);
//
//        List<Employee> employeeList = query.list();
//
//        transaction.commit();
//        session.close();
//        return employeeList;
//    }
}