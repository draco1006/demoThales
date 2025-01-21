package com.tech.sii.demo.employee;

public class EmployeeSalary extends Employee{
    private int anual_salary;
    public int getAnual_salary() {
        return this.anual_salary;
    };
    public void setAnual_salary(int anual_salary) {
        this.anual_salary = anual_salary;
    }

    EmployeeSalary(Employee emp) {
        this.setEmployee_age(emp.getEmployee_age());
        this.setEmployee_name(emp.getEmployee_name());
        this.setEmployee_salary(emp.getEmployee_salary());
        this.setId(emp.getId());
        this.setProfile_image(emp.getProfile_image());
    }
}