package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepo;
import com.tpe.repository.Repository;

public class MailService implements MessageService {

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via mail: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
        Repository dbRepo = new DBRepo();
        dbRepo.save(message);
    }

}
