package com.example;

import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository {


      @Override
      public List<Employee> findAll() {
            return List.of(
                  new Employee("1", 1000),
                  new Employee("2", 2000)

            );


      }

      @Override
      public Employee save(Employee e) {
            return null;
      }
}
