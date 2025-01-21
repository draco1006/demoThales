package com.tech.sii.demo.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Employee {
    @JsonProperty("id")
    private int id;
    @JsonProperty("employee_age")
    private int employee_age;
    @JsonProperty("employee_salary")
    private int employee_salary;
    @JsonProperty("employee_name")
    private String employee_name;
    @JsonProperty("profile_image")
    private String profile_image;

    

    
    @JsonSetter("id")
    public void setId(int id){
        this.id = id;
    }
    @JsonSetter("employee_age")
    public void setEmployee_age(int employee_age){
        this.employee_age = employee_age;
    }
    @JsonSetter("employee_salary")
    public void setEmployee_salary(int employee_salary){
        this.employee_salary = employee_salary;
    }
    @JsonSetter("employee_name")
    public void setEmployee_name(String employee_name){
        this.employee_name = employee_name;
    }
    @JsonSetter("profile_image")
    public void setProfile_image(String profile_image){
        this.profile_image = profile_image;
    }

    public int getId() {
        return this.id;
    }
    public int getEmployee_age() {
        return this.employee_age;
    }
    public int getEmployee_salary() {
        return this.employee_salary;
    }
    public String getEmployee_name() {
        return this.employee_name;
    }
    public String getProfile_image() {
        return this.profile_image;
    }
}
