package com.pluralsight;

public class Employee {
    String employeeId = "";
    String name = "";
    double hoursWorked =0;
    double payRate = 0;

    public Employee(String employeeId, double payRate, double hoursWorked, String name) {
        this.employeeId = employeeId;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.name = name;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossPay() {
        return hoursWorked * payRate;
    }

}

