package org.softwaretechnologies.employee;

import org.softwaretechnologies.employee.Employee;

public class Programmer extends Employee {
    public Programmer(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        return baseSalary;
    }
}