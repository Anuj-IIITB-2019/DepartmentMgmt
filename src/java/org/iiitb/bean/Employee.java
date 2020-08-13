package org.iiitb.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
public class Employee{
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private Integer empSurroggate;

@Column(unique = true)
public int empId;

String eFname;

String eLname;

int salary;

@ManyToOne
@NotBlank
Department department = new Department();

    public String geteFname() {
        return eFname;
    }

    public void seteFname(String eFname) {
        this.eFname = eFname;
    }

    public String geteLname() {
        return eLname;
    }

    public void seteLname(String eLname) {
        this.eLname = eLname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Integer getEmpSurroggate() {
        return empSurroggate;
    }

    public void setEmpSurroggate(Integer empSurroggate) {
        this.empSurroggate = empSurroggate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

