/*

Program: UEmployee.java          Last Date of this Revision: April 15

Purpose: generic employee class

Author: Reynaldo de Guzman 
School: CHHS
Course: CSE2130 - CSE 3130 Object-Oriented Programming 2
 

*/
package Mastery1;

/**
 * An abstract base class representing a University Employee.
 * Provides common properties and behaviors for all university employee types.
 */
public abstract class UEmployee {
    private final String name;    // Employee's full name
    private final double salary;  // Annual salary in USD

    /**
     * Constructs a new UEmployee with specified name and salary.
     *
     * @param name   The employee's full name (cannot be null or empty)
     * @param salary The employee's annual salary in USD (must be positive)
     * @throws IllegalArgumentException if name is null/empty or salary is non-positive
     */
    public UEmployee(String name, double salary) {
        validateParameters(name, salary);
        this.name = name;
        this.salary = salary;
    }

    /**
     * Validates constructor parameters.
     *
     * @param name   Employee name to validate
     * @param salary Employee salary to validate
     */
    private void validateParameters(String name, double salary) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be null or empty");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }
    }

    /**
     * Gets the employee's name.
     *
     * @return The employee's full name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the employee's annual salary.
     *
     * @return The employee's salary in USD
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Returns a string representation of the university employee.
     *
     * @return Formatted string containing employee name and salary
     */
    @Override
    public String toString() {
        return String.format("Employee Name: %s, Salary: $%,.2f", name, salary);
    }
}