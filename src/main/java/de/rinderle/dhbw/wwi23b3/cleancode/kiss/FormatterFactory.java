package de.rinderle.dhbw.wwi23b3.cleancode.kiss;

import java.time.format.DateTimeFormatter;

interface FormatterFactory {
    DateTimeFormatter createFormatter();
}