package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepo;
import com.tpe.repository.FileRepo;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("mailService")
//@Qualifier
//@Scope (value = "singleton")  // by default it is singleton
@Scope (value = "prototype")    // everytime the bean is requested, teh new instance will be created
public class MailService implements MessageService {

    public void postConstractor () {
        System.out.println("==================== Mail Service Bean has been created ====================");
    }

    public void preDestroy () {
        System.out.println("==================== Mail Service Bean has been destroyed ====================");
    }

    @Autowired
    @Qualifier ("fileRepo")
    Repository repo;

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via mail: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
//        Repository repo = new FileRepo();
//        repo.save(message);
    }

}
