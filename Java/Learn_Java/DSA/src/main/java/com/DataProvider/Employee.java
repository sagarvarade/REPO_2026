package com.DataProvider;

import java.time.LocalDate;

public record Employee(String name, String surNamem, Integer salary, String dept, LocalDate joiningDate, Integer age,
                       String gender, String city) {

    @Override
    public String toString() {
        return "Employee [name=" + name + ", surNamem=" + surNamem + ", salary=" + salary + ", dept=" + dept + ", joiningDate=" + joiningDate + ", age=" + age + ", gender=" + gender + ", city=" + city + "]";
    }
}