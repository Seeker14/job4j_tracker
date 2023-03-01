package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Fact.calc(-2));
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }
}