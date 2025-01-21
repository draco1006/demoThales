package com.tech.sii.demo.ejb;

import javax.ejb.Local;

@Local
public interface EmployeeSession {
    public int anualSalary(int employee_salary);
}
