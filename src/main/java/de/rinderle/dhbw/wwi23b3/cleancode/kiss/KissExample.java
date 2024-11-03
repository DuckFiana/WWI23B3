package de.rinderle.dhbw.wwi23b3.cleancode.kiss;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KissExample {

    @Autowired
    private GermanFormatterFactory germanFormatterFactory;

    public String getFormattedDate(LocalDateTime input) {
        DateTimeFormatter formatter = germanFormatterFactory.createFormatter();

        return input.format(formatter);
    }
}
