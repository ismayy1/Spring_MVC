package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepo;
import com.tpe.repository.FileRepo;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("mailService")
//@Qualifier
public class MailService implements MessageService {

    Repository repo;

//    public MailService(Repository repo) {
//        this.repo = repo;
//    }

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via mail: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
//        Repository repo = new FileRepo();
//        repo.save(message);
    }

}
