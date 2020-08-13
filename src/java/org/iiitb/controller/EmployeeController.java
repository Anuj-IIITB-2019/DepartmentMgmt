package org.iiitb.controller;

import org.iiitb.bean.Department;
import org.iiitb.bean.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/employee")
public class EmployeeController {
    Employee employee = new Employee();
    Department department = new Department();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  Response findAllEmployees(int deptSurrogate) {
        List<Employee> employeeList = new ArrayList <Employee>();
        return Response.ok().entity(employeeList).build();
    }
}