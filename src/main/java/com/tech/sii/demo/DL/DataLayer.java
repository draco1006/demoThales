package com.tech.sii.demo.DL;

import com.tech.sii.demo.employee.Employee;

public class DataLayer extends DataLayerBase{

    private Employee[] data;

    public Employee[] getData() {
        return this.data;
    }
    void setData(Employee[] data) {
        this.data = data;
    };

}
