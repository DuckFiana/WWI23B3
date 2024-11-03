package de.rinderle.dhbw.wwi23b3.cleancode.kiss;

import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
class GermanFormatterFactory implements FormatterFactory {

    @Override
    public DateTimeFormatter createFormatter() {
        return DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm", Locale.GERMANY);
    }
}