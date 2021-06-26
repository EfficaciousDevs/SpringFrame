package com.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("StereoConfig.xml");
        //A a = context.getBean("a",A.class);
        A a = context.getBean("stereos",A.class);
        A a2 = context.getBean("stereos",A.class);

        System.out.println(a.hashCode());
        System.out.println(a);
        System.out.println(a2.hashCode());
        System.out.println(a2);
    }
}
