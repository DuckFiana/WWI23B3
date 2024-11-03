package de.rinderle.dhbw.wwi23b3.cleancode.demeter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Birthday {

    private final LocalDate birthday;

    public Birthday(LocalDate birthday) {
        if (birthday == null) {
            throw new IllegalArgumentException("birthday is null");
        } else if (birthday.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("birthday is after now");
        }

        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getFormattedBirthday() {
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMANY);

        return birthday.format(germanFormatter);
    }

}