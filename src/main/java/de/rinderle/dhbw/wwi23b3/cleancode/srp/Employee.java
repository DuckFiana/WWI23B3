package de.rinderle.dhbw.wwi23b3.cleancode.srp;

class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return Math.round(salary * 0.1);
    }

    public String generateReport() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}