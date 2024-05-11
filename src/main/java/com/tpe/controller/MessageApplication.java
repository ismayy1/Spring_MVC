package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepo;
import com.tpe.repository.FileRepo;
import com.tpe.repository.Repository;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;
import com.tpe.service.WhatsAppService;

public class MessageApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Intro ro Dependency Injection....");

        //send message via mail servce
//        MailService mailService = new MailService();
//        mailService.sendMessage(message);

        // don't send the message above, send the message on whatsapp
//        MessageService whatsAppService = new WhatsAppService();
//        whatsAppService.sendMessage(message);
//
//        MessageService smsService = new SmsService();
//        smsService.sendMessage(message);

//        Repository repository = new DBRepo();
//        repository.save(message);

        //without injection (DI)
//        MailService service = new MailService();
//        service.sendMessage(message);
//        service.saveMessage(message);


        // WITH Dependency Injection (DI)
        Repository repo = new DBRepo();

//        MessageService messageService = new MailService(repo);
//        messageService.saveMessage(message);
        //to save to File

        // dependency Injection
        WhatsAppService service = new WhatsAppService(repo);
        service.saveMessage(message);

    }
}
