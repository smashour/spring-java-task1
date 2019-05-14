package com.stackroute.springs;

import com.stackroute.springs.bean.Actor;
import com.stackroute.springs.bean.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie) context.getBean("movie");
        //Actor actor=(Actor) context.getBean("actor");
        System.out.println(movie.getActor());
    }
}
