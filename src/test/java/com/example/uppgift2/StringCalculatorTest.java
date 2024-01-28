package com.example.uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


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

      @Test
      @DisplayName("Assert that any amount of numbers returns sum")
      void assertThatAnyAmountOfNumbersReturnsSum() {
            int result = StringCalculator.add("1,2,3,4,5");
            assertThat(result).isEqualTo(15);
      }

      @Test
      @DisplayName("Given string with new line  or comma between numbers should return sum of numbers")
      void givenStringWithNewLineOrCommaBetweenNumbersShouldReturnSumOfNumbers() {
            int result = StringCalculator.add("1\n2,3");
            assertThat(result).isEqualTo(6);
      }

      @Test
      @DisplayName("Assert that a custom delimiter can be used")
      void assertThatACustomDelimiterCanBeUsed() {
            int result = StringCalculator.add("//;\n1;2");
            assertThat(result).isEqualTo(3);
      }

      @Test
      @DisplayName("Assert that there is no negative numbers")
      void assertThatThereIsNoNegativeNumbers() {

            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {StringCalculator.add("-1");});
            assertThat(exception.getMessage()).contains("Negative numbers not allowed -1");
      }

      @Test
      @DisplayName("Assert that multiple negative numbers throws exception")
      void assertThatMultipleNegativeNumbersThrowsException() {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {StringCalculator.add("-1,2,3,-4");});
            assertThat(exception.getMessage()).contains("Negative numbers not allowed -1,-4");
      }





}