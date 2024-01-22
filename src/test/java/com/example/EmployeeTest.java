package com.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


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

      @Test
      @DisplayName("Check that isPaid returns true")
      void checkThatIsPaidReturnsTrue() {
            Employee employee = new Employee("4", 10000);
            employee.setPaid(true);
            var result = employee.isPaid();
            assertThat(result).isTrue();
      }

      @Test
      @DisplayName("Check that isPaid returns false")
      void checkThatIsPaidReturnsFalse() {
            Employee employee = new Employee("5", 10000);
            employee.setPaid(false);
            var result = employee.isPaid();
            assertThat(result).isFalse();
      }

      @Test
      @DisplayName("Check that setPaid sets true")
      void checkThatSetPaidSetsTrue() {
            Employee employee = new Employee("5", 10000);
            employee.setPaid(true);
            var result = employee.isPaid();
            assertThat(result).isTrue();

      }

      @Test
      @DisplayName("Cheack that setPaid ")
      void cheackThatSetPaid() {
      Employee employee = new Employee("6", 10000);
            employee.setPaid(false);
            var result = employee.isPaid();
            assertThat(result).isFalse();

      }

      @Test
      @DisplayName("Check that toString returns correct string")
      void checkThatToStringReturnsCorrectString() {
            Employee employee = new Employee("7", 10000);
            var result = employee.toString();
            assertThat(result).isEqualTo("Employee [id=7, salary=10000.0]");
      }






}