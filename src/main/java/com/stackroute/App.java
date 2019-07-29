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
//        Get Movie through XMLBeanFactory
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movieThroughXmlBeanFactory = xmlBeanFactory.getBean("movie", Movie.class);
        System.out.println("Movie through XmlBeanFactory: " + movieThroughXmlBeanFactory);

//        Get Movie through AppilicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie.toString());

    }
}
