package com.tpe.controller;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageApplicationSpring {
    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Intro to Spring Annotations");

        //scans config class, and using component Scan, scans all the classes creates single bean from those annotated classes
        // and stores it in context makes it ready to be used. And when beans are requested it will inject dependencies and gives...
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        //send message via SmsService
        // MessageService service = new SmsService(); // we do not create, it is outsourced
//        MessageService service = context.getBean(SmsService.class);   // we didn't use new keyword to create an instance
//        service.sendMessage(message);

        MessageService service2 = context.getBean("sms-Service", MessageService.class);
        service2.sendMessage(message);

        // if there are more than one child of interface, then we need to use bean name
        // default bean name is the class name with lowerCase, but we can customize the class name

    }
}