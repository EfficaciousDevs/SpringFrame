package com.SpringCore.JDBC.EmployeeDAO.RowMapper;

import com.SpringCore.JDBC.EmployeeDTO.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(resultSet.getInt(1));
        emp.setFirstName(resultSet.getString(2));
        emp.setLastName(resultSet.getString(3));
        return emp;
    }
}
