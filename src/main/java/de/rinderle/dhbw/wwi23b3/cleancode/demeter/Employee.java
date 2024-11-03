package de.rinderle.dhbw.wwi23b3.cleancode.demeter;

class Employee {
    private final String name;
    private final Birthday birthday;

    public Employee(String name, Birthday birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public String getFormattedBirthday() {
        return birthday.getFormattedBirthday();
    }

    public String getName() {
        return name;
    }
}