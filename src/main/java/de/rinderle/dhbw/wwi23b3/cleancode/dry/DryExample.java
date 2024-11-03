package de.rinderle.dhbw.wwi23b3.cleancode.dry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DryExample {

    public String getFormattedDate(LocalDateTime input) {
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm", Locale.GERMANY);

        return input.format(germanFormatter);
    }
}
