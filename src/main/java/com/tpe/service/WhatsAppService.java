package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepo;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("whatsAppService")
public class WhatsAppService implements MessageService {

    @Autowired  // injects the dependency
//    @Qualifier ("fileRepo")
    @Qualifier ("dbRepo")
    Repository repo;

    // constructor
    // after you add the qualifier and set the DB Component, it doesn't give an error with this constructor
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
