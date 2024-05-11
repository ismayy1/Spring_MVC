package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepo;
import com.tpe.repository.Repository;
import org.springframework.stereotype.Component;

@Component ("whatsAppService")
public class WhatsAppService implements MessageService {

    Repository repo;

    // constructor
//    public WhatsAppService(Repository repo) {
//        this.repo = repo;
//    }

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via WhatsApp: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
//        Repository repo = new FileRepo();
        repo.save(message);
    }

}
