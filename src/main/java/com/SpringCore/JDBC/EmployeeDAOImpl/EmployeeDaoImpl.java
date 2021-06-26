package com.SpringCore.JDBC.EmployeeDAOImpl;

import com.SpringCore.JDBC.EmployeeDAO.EmployeeDao;
import com.SpringCore.JDBC.EmployeeDAO.RowMapper.EmployeeRowMapper;
import com.SpringCore.JDBC.EmployeeDTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int Create(Employee employee) {
        String query = "insert into employee values(?,?,?)";
        return jdbcTemplate.update(query, employee.getId(),employee.getFirstName(),employee.getLastName());
    }
    @Override
    public int update(Employee employee){
        String query = "update employee set FirstNAme=?,LastName=? where id=?";
        return jdbcTemplate.update(query, employee.getFirstName(),employee.getLastName(),employee.getId());
    }
    @Override
    public int delete(int id){
        String query = "delete from employee where id=?";
        return jdbcTemplate.update(query,id);
    }

    @Override
    public Employee read(int id) {
        String query = "select * from employee where id = ?";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        Employee employee = jdbcTemplate.queryForObject(query,rowMapper,id);
        return employee;
    }

    @Override
    public List<Employee> ReadMultiple() {
        String query = "SELECT * FROM EMPLOYEE";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        List<Employee> employee = jdbcTemplate.query(query,rowMapper);
        return employee;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
