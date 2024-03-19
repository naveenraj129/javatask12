package com.example.hr;

public class Employee {
    String name;
    Integer id;
    double salary;
    public void printName(){
        System.out.println(name);
    }
    public void printSalary(){
        System.out.println(salary);
    }
public void setName(String x){
        this.name=x;
}
public void setSalary(double y) {
    this.salary = y;
}
public void setId(Integer z){
        this.id = z;
}
}
