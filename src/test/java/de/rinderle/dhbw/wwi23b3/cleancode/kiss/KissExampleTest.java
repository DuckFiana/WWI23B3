package de.rinderle.dhbw.wwi23b3.cleancode.kiss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class KissExampleTest {

    @Mock
    GermanFormatterFactory germanFormatterFactory;

    @InjectMocks
    KissExample kissExample;

    @Test
    void getFormattedDate() {
        DateTimeFormatter dateTimeFormatter = mock(DateTimeFormatter.class);
        when(germanFormatterFactory.createFormatter()).thenReturn(dateTimeFormatter);

        LocalDateTime inputDate = LocalDateTime.of(2023, 11, 20, 23, 51);
        String expectedResult = "20.11.2023 23:51";
        when(dateTimeFormatter.format(inputDate)).thenReturn(expectedResult);

        String result = kissExample.getFormattedDate(inputDate);

        assertThat(result).isEqualTo(expectedResult);
    }
}