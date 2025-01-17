package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class EmployeeTest {

      private Employee employee;
      @BeforeEach
      void setUp() {
            employee = new Employee("999", 35000.0);
      }

      @Test
      @DisplayName("Check that getId returns correct Id")
      void checkThatGetIdReturnsCorrectId() {
            var result = employee.getId();
            assertThat(result).isEqualTo("999");
      }

      @Test
      @DisplayName("Check that setId sets right id")
      void checkThatSetIdSetsRightId() {
            employee.setId("2");
            var result = employee.getId();
            assertThat(result).isEqualTo("2");
      }

      @Test
      @DisplayName("Check that getSalary returns correct salary")
      void checkThatGetSalaryReturnsCorrectSalary(){
            var result = employee.getSalary();
            assertThat(result).isEqualTo(35000.0);
            
      }

      @Test
      @DisplayName("Check that setSalary sets correct salary")
      void checkThatSetSalarySetsCorrectSalary() {
            employee.setSalary(10000);
            var result = employee.getSalary();
            assertThat(result).isEqualTo(10000);
      }

      @Test
      @DisplayName("Check that isPaid returns false")
      void checkThatIsPaidReturnsFalse() {
            var result = employee.isPaid();
            assertThat(result).isFalse();
      }

      @Test
      @DisplayName("Check that setPaid sets false")
      void checkThatSetPaidSetsFalse() {
            employee.setPaid(false);
            assertThat(employee.isPaid()).isFalse();

      }

      @Test
      @DisplayName("Check that toString returns correct string")
      void checkThatToStringReturnsCorrectString() {
            var result = employee.toString();
            assertThat(result).isEqualTo("Employee [id=999, salary=35000.0]");
      }






}