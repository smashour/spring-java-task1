package com.stackroute.springs;


import com.stackroute.springs.bean.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieA=(Movie) context.getBean("movieA");
        Movie movieB=(Movie) context.getBean("movieB");
        System.out.println(movieA==movieB);
    }
}
