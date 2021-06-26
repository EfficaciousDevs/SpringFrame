package com.SpringCore.JDBC.EmployeeDAO;

import com.SpringCore.JDBC.EmployeeDTO.Employee;

import java.util.List;

public interface EmployeeDao {
    int Create(Employee employee);
    int update(Employee employee);
    int delete(int id);
    Employee read(int id);
    List<Employee> ReadMultiple();
}
