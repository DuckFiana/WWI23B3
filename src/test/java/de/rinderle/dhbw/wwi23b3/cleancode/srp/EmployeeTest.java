package de.rinderle.dhbw.wwi23b3.cleancode.srp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EmployeeTest {

    @Test
    void getSalary() {
        double expectedSalary = 35.34;

        Employee underTest = new Employee("Stefan", expectedSalary);

        assertThat(underTest.getSalary()).isEqualTo(expectedSalary);
    }

    @Test
    void calculateBonus() {
        double salary = 35.34;

        Employee underTest = new Employee("Stefan", salary);

        double result = underTest.calculateBonus();
        assertThat(result).isEqualTo(4.0);
    }

    @Test
    void generateReport() {
        Employee underTest = new Employee("Stefan", 33.55);

        String result = underTest.generateReport();
        assertThat(result).isEqualTo("Employee: Stefan, Salary: 33.55");
    }
}