package org.iiitb.controller;

import org.iiitb.bean.Department;
import org.iiitb.service.DepartmentService;
import org.iiitb.service.Impl.DepartmentServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Path("/department")
public class DepartmentController {
    private DepartmentService departmentService = new DepartmentServiceImpl();

    @Path("/departmentList")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response listDepartments() {

        List<Department> departments = departmentService.findAll();
//            if(departments = null)
//                Response.noContent();
        return Response.ok().entity(departments).build();
    }

    @Path("/addDepartment")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response addDepartment(@FormParam("deptId") int deptId,
                                  @FormParam("dName") String dName,
                                  @FormParam("dCapacity") int dCapacity) throws URISyntaxException {
        Department department = new Department();
        department.setDeptId(deptId);
        department.setdName(dName);
        department.setdCapacity(dCapacity);

        departmentService.save(department);
        return Response.seeOther(new URI("")).build();
    }

    @Path("/updateDepartmentById")
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateDepartment(Department department,int dCapacity)
    {

        return Response.ok().build();
    }

    @Path("/updateDepartmentByName")
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateDepartment(Department department,String dName)
    {

        return Response.ok().build();
    }

    @Path("/deleteDepartment")
    @GET
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteDepartment(Department department)
    {
        return Response.ok().build();
    }
}