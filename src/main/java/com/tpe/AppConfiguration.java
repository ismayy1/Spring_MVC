package com.tpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;
import java.util.Random;

@Configuration //this class will be responsible for configuration
@ComponentScan("com.tpe") //scans all classes in the same level packages
//by default it will scan all classes in the same package, but we can also customize
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Autowired ()   // helps to read data from propertySource (properties)
    private Environment environment;    // it's an interface from Spring


    @Bean   // if we did not create the (third party class), @Bean annotation is used to create bean
    public Random getRandomNumber () {
        return new Random();
    }

    // instead of using @Value to read data from properties, we can use Properties class and Environment
    // to read/access the data
    // it's useful in the case we have more properties in the properties file
    @Bean
    public Properties properties () {
        Properties properties = new Properties();   // works using hashTable, it just stores key - value format
        properties.put("myEmail", environment.getProperty("email"));
        properties.put("phoneNumber", environment.getProperty("phone"));
        return properties;
    }

}