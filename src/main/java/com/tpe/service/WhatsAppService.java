package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsAppService {

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via WhatsApp: "+message.getBody());
    }

}
