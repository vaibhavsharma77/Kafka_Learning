package com.kafka.understanding.kafkapubsub;

public class UserModel {
    public String name;
    public String Department;
    public Double Salary;

    public UserModel(String name, String department, Double salary) {
        this.name = name;
        Department = department;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
