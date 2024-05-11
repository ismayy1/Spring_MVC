package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component // instance of this class will be created by spring
// we are outsourcing control to spring (Inversion of Control)
public class SmsService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message has been sent via mail: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {

    }
}