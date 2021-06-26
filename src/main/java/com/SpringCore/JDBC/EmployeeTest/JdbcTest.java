package com.SpringCore.JDBC.EmployeeTest;

import com.SpringCore.JDBC.EmployeeDAO.EmployeeDao;
import com.SpringCore.JDBC.EmployeeDTO.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringJdbcConfig.xml");
        EmployeeDao Dao = context.getBean("employeeDao",EmployeeDao.class);

        Employee emp = new Employee();
        emp.setId(25);
        emp.setFirstName("Akshay");
        emp.setLastName("Kumar");

//        int result = Dao.Create(emp);    // Insert Record
//        System.out.println("record(s) inserted: "+ result);

//        int result = Dao.update(emp);  //Update Record

//        int result = Dao.delete(25);   // Delete Record
//        System.out.println("Record(s) deleted: " + result);

//        Employee employee = Dao.read(25); // reading single record

        List<Employee> records = Dao.ReadMultiple();
        System.out.println(records);

    }
}
