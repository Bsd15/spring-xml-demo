package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println("Movie 1: " + movie1.toString());
        Movie movie2 = context.getBean("movie", Movie.class);
        System.out.println("Movie 2: " + movie2.toString());
        System.out.println("Movie 1 == Movie 2: " + (movie1 == movie2));
        Movie protypeMovie1 = context.getBean("prototypeMovie1", Movie.class);
        System.out.println("Movie 1: " + protypeMovie1.toString());
        Movie protypeMovie2 = context.getBean("prototypeMovie2", Movie.class);
        System.out.println("Movie 1: " + protypeMovie2.toString());
        System.out.println("Movie 1 == Movie 2 (Beans of scope prototype): " + (protypeMovie1 == protypeMovie2));
        context.close();
    }
}
