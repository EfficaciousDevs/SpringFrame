package com.SpringCore.SetterInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompleteTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SetterConfig.xml");
        CompleteInjectionDependencies cid = context.getBean("cidepend",CompleteInjectionDependencies.class);

        System.out.println("Setter injection Dependencies");
        System.out.println("Pid: " + cid.getPersonId());
        System.out.println("Name: " + cid.getPersonName());
        System.out.println();
        System.out.println(cid.getPersonBankAccounts());
        System.out.println(cid.getPersonBankAccounts().getClass().getName());
        System.out.println();
        System.out.println(cid.getAccountNumbers());
        System.out.println(cid.getAccountNumbers().getClass().getName());
        System.out.println();
        System.out.println(cid.getHouseholdProducts());
        System.out.println(cid.getHouseholdProducts().getClass().getName());
        System.out.println();
        System.out.println(cid.getCompaniesWorked());
        System.out.println(cid.getCompaniesWorked().getClass().getName());

        context.close();
    }
}
