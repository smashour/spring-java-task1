package com.stackroute.springs;


import com.stackroute.springs.bean.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie) context.getBean("movie");
        //movie.show();
    }
}
