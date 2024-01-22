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
      @DisplayName("Check that setSalary sets correct salary")
      void checkThatSetSalarySetsCorrectSalary() {
            employee.setSalary(10000);
            var result = employee.getSalary();
            assertThat(result).isEqualTo(10000);
      }

      @Test
      @DisplayName("Check that isPaid returns true")
      void checkThatIsPaidReturnsTrue() {
            employee.setPaid(true);
            var result = employee.isPaid();
            assertThat(result).isTrue();
      }

      @Test
      @DisplayName("Check that isPaid returns false")
      void checkThatIsPaidReturnsFalse() {
            employee.setPaid(false);
            var result = employee.isPaid();
            assertThat(result).isFalse();
      }

      @Test
      @DisplayName("Check that setPaid sets true")
      void checkThatSetPaidSetsTrue() {
            employee.setPaid(true);
            assertThat(employee.isPaid());

      }

      @Test
      @DisplayName("Check that setPaid ")
      void checkThatSetPaid() {
            employee.setPaid(false);
            var result = employee.isPaid();
            assertThat(result).isFalse();

      }

      @Test
      @DisplayName("Check that toString returns correct string")
      void checkThatToStringReturnsCorrectString() {
            var result = employee.toString();
            assertThat(result).isEqualTo("Employee [id=999, salary=35000.0]");
      }






}