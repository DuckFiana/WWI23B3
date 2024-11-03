package de.rinderle.dhbw.wwi23b3.cleancode.dry;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DryExampleTest {

    @Test
    public void test() {
        String result = new DryExample().getFormattedDate(LocalDateTime.of(2023, 11, 20, 23, 51));

        assertThat(result).isEqualTo("20.11.2023 23:51");
    }

}