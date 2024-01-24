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
            int payments = employees.payEmployees();

            assertThat(payments).isEqualTo(2);

      }






}



