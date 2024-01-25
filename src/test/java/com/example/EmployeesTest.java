package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

class EmployeesTest {


      @Test
      @DisplayName("Check that all employees are paid")
      void checkThatAllEmployeesArePaid() {
            BankService bankService = new BankServiceStub();
            EmployeeRepository employeeRepository = new EmployeeRepositoryStub();
            Employees employees = new Employees(employeeRepository, bankService);
            Employee employee = new Employee("1", 1000);
            int numberOfPayments = employees.payEmployees();

            assertThat(numberOfPayments).isEqualTo(2);

      }

      @Test
      @DisplayName("If RuntimeException is thrown then payments should be 0")
      void ifRuntimeExceptionIsThrownThenPaymentsShouldBe0() {
            BankService bankServiceMock = Mockito.mock(BankService.class);
            doThrow(RuntimeException.class).when(bankServiceMock).pay(anyString(), anyDouble());
            EmployeeRepository employeeRepository = new EmployeeRepositoryStub();
            Employees employees = new Employees(employeeRepository, bankServiceMock);
            // Act
            int payments = employees.payEmployees();
            // Assert
            assertThat(payments).isEqualTo(0);
            verify(bankServiceMock, times(2)).pay(anyString(), anyDouble());
            assertThat(employeeRepository.findAll()).extracting(Employee::isPaid).containsOnly(false);
      }









}



