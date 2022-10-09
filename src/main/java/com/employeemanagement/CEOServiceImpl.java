package com.employeemanagement;

public class CEOServiceImpl implements CEOService {
    @Override
    public String fireEmployee(String name) {
        return name + " has been fired";
    }

    public String hireEmployee(String name) {


        return name + " has been hired";
    }
}
