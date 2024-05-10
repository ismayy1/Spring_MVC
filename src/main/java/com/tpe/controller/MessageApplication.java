package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.WhatsAppService;

public class MessageApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Intro ro Dependency Injection....");

        //send message via mail servce
//        MailService mailService = new MailService();
//        mailService.sendMessage(message);

        // don't send the message above, send the message on whatsapp
        WhatsAppService whatsAppService = new WhatsAppService();
        whatsAppService.sendMessage(message);

    }
}
