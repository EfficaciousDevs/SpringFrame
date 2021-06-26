package com.SpringCore.AutoWiring;

import java.util.Calendar;
import java.util.Date;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

        @Bean
        public Person person() {
            // Creating an 'Employee' bean
            Person person = new Person();

            // Setter-based injection:-

            // Similar to <property name="empId" value="1234" />
            person.setEmpId(1234);

            // Similar to <property name="empName" value="Akshay" />
            person.setEmpName("Akshay");

            // The below statement isn't required due to 'autowiring'
            // employee.setPassObj(passObj());

            return person;
        }

        @Bean
        public Passport passObj() {

            // Creating a 'Passport' bean
            Passport passport = new Passport();

            Date todayDate = new Date();

            // Using 'Calendar' class to add 84 days to todayDate (expiryDate)
            Calendar cal = Calendar.getInstance();
            cal.setTime(todayDate);
            cal.add(Calendar.DATE, 84);

            Date expiryDate = cal.getTime();

            // Similar to <property name="passNum" value="9876" />
            passport.setPassNum(9876);

            // The below 2 setters cannot be used in an xml config file
            // as they are dynamic values
            passport.setDateOfIssue(todayDate);
            passport.setDateOfExpiry(expiryDate);

            return passport;
        }
}
