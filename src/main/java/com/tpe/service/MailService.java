package com.tpe.service;

import com.tpe.domain.Message;

public class MailService {

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via mail: "+message.getBody());
    }

}
