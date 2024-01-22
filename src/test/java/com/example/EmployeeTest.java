package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

      @Test
      @DisplayName("Check that getId returns correct Id")
      void checkThatGetIdReturnsCorrectId() {
            Employee employee = new Employee("1", 10000);
            var result = employee.getId();
            assertThat(result).isEqualTo("1");
      }

      @Test
      @DisplayName("Check that setId sets right id")
      void checkThatSetIdSetsRightId() {
            Employee employee = new Employee("2", 10000);
            employee.setId("2");
            var result = employee.getId();
            assertThat(result).isEqualTo("2");
      }

      @Test
      @DisplayName("Check that setSalary sets correct salary")
      void checkThatSetSalarySetsCorrectSalary() {
            Employee employee = new Employee("3", 10000);
            employee.setSalary(10000);
            var result = employee.getSalary();
            assertThat(result).isEqualTo(10000);
      }








}