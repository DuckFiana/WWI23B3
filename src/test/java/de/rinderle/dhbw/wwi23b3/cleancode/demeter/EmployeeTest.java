package de.rinderle.dhbw.wwi23b3.cleancode.demeter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeTest {

    @Test
    void getBirthday() {
        Birthday expectedBirthday = mock(Birthday.class);
        Employee underTest = new Employee("Stefan", expectedBirthday);

        assertThat(underTest.getBirthday()).isEqualTo(expectedBirthday);
    }

    @Test
    void getFormattedBirthday() {
        String juhu = "expectedFormattedBirthday";

        Birthday expectedBirthday = mock(Birthday.class);
        when(expectedBirthday.getFormattedBirthday()).thenReturn(juhu);
        Employee underTest = new Employee("Stefan", expectedBirthday);

        assertThat(underTest.getFormattedBirthday()).isEqualTo(juhu);
    }
}