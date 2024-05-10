package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsAppService implements MessageService {

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via WhatsApp: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {

    }

}
