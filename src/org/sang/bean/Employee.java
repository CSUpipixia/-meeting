package org.sang.bean;
//人员

import org.sang.dao.DepartmentDao;

public class Employee {
    private int employeeid;
    private String employeename;
    private String username;
    private String phone;
    private String email;
    private int status;//

    private int departmentid;
    private String departmentname;
    private String password;
    private int credits;//信誉积分
    private int role;//

    public Employee(String employeename, String username, String phone, String email, int departmentid) {
        this.employeename = employeename;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.departmentid = departmentid;
    }

    public Employee(int employeeid, String employeename, String username, String phone, String email, int status, int departmentid, String password, int role) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.departmentid = departmentid;
        this.password = password;
        this.role = role;
    }

    public Employee(int employeeid, String employeename, String username, String phone, String email, int status, int departmentid, String password, int role, int credits) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.departmentid = departmentid;
        this.password = password;
        this.role = role;
        this.credits = credits;
    }

    public Employee(int employeeid, String employeename, String username, String phone, String email, int status, int departmentid, String departmentname, String password, int role, int credits) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.departmentid = departmentid;
        this.departmentname = departmentname;
        this.password = password;
        this.role = role;
        this.credits = credits;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

}
