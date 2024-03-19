package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee obj = new Employee();

obj.setId(12345);
obj.setName("naveen");
obj.setSalary(123567);

obj.printName();
obj.printSalary();
    }
}
