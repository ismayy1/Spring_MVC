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

        //send message via SmsSerervice
        // MessageService service = new SmsService(); // we do not create, it is outsourced
        MessageService service = context.getBean(SmsService.class);
        service.sendMessage(message);
    }
}