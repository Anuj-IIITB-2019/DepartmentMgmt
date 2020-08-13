package org.iiitb.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Department{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptSurrogate;

    @Column(unique = true)
    public int deptId;

    @Column(unique = true,nullable = false)
    public String dName;

    @NotBlank
    public int dCapacity;

    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees = new HashSet<>();

    public Integer getDeptSurrogate() {
        return deptSurrogate;
    }

    public void setDeptSurrogate(Integer deptSurrogate) {
        this.deptSurrogate = deptSurrogate;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdCapacity() {
        return dCapacity;
    }

    public void setdCapacity(int dCapacity) {
        this.dCapacity = dCapacity;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}