package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration //this class will be responsible for configuration
@ComponentScan("com.tpe") //scans all classes in the same level packages
//by default it will scan all classes in the same package, but we can also customize
public class AppConfiguration {


    @Bean   // if we did not create the (third party class), @Bean annotation is used to create bean
    public Random getRandomNumber () {
        return new Random();
    }

}