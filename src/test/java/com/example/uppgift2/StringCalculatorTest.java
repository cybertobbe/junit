package com.example.uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
      @Test
      @DisplayName("Check that an empty string returns 0")
      void checkThatAnEmptyStringReturns0() {
           int result = StringCalculator.add("");
           assertThat(result).isEqualTo(0);
      }

}
