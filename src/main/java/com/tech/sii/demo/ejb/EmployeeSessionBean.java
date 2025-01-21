package com.tech.sii.demo.ejb;

import javax.ejb.Stateless;

@Stateless(name = "EmployeeSession")
public class EmployeeSessionBean implements EmployeeSession{

    @Override
    public int anualSalary(int employee_salary) {
        return employee_salary*12;
    }
}
