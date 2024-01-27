package com.example.uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
      @Test
      @DisplayName("Assert that an empty string returns 0")
      void assertThatAnEmptyStringReturns0() {
           int result = StringCalculator.add("");
           assertThat(result).isEqualTo(0);
      }

      @Test
      @DisplayName("Check that '1' returns 1")
      void checkThat1Returns1() {
             int result = StringCalculator.add("1");
             assertThat(result).isEqualTo(1);
      }

      @Test
      @DisplayName("Given string 1 and 2 then return 3")
      void givenString1and2ThenReturn3() {
            int result = StringCalculator.add("1,2");
            assertThat(result).isEqualTo(3);

      }




}
