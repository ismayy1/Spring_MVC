package com.tpe.controller;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;
import com.tpe.service.WhatsAppService;
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

//        MessageService service2 = context.getBean("smsService", MessageService.class);
//        service2.sendMessage(message);

        // if there are more than one child of interface, then we need to use bean name
        // default bean name is the class name with lowerCase, but we can customize the class name

        // if there are dependencies of
        MessageService service3 = context.getBean("whatsAppService", WhatsAppService.class);
        service3.saveMessage(message);

//        MessageService service4 = context.getBean("whatsAppService", WhatsAppService.class);

        /*
            Spring dependency Injection
                1. we did not use new keyword
                2. dependency is injected by spring via @Autowired
                3. we did not create repo
         */

        context.close();

//        System.out.println("Context is closed");
//        context.getBean("mailService", MailService.class);    // once the context is closed, you can't use the context another bean anymore

    }
}