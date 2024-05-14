package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepo;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component ("whatsAppService")
//@Scope  // by default it is singleton
public class WhatsAppService implements MessageService {


    @Value("${email}")
    private String email;

    @Value("${phone}")
    private String phone;

    //========= field injection ==========
    // it's easy to use and the type of teh injection will be set while run time via reflection api
    // unsecure, may cause errors
//    @Autowired  // injects the dependency
////    @Qualifier ("fileRepo")
//    @Qualifier ("dbRepo")
//    Repository repo;

    //========= constructor injection ==========
//    private final Repository repo;
//    @Autowired
//    public WhatsAppService(@Qualifier ("dbRepo") Repository repo) {
//        this.repo = repo;
//    }

    @PostConstruct
    public void postConstractor () {
        System.out.println("==================== WhatsApp Service Bean has been created ====================");
    }

    @PreDestroy
    public void preDestroy () {
        System.out.println("==================== WhatsApp Service Bean has been destroyed ====================");
    }

    //========= setter injection ==========
    private Repository repo;
    @Autowired
    @Qualifier ("fileRepo")
    public void setRepo (Repository repo) {
        this.repo = repo;
    }

    public void sendMessage(Message message){
        System.out.println("Your message has been sent via WhatsApp: "+message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
//        Repository repo = new FileRepo();
        repo.save(message);
    }


    public void printContactsInfo () {
        System.out.println("Your email: " + this.email);
        System.out.println("Your phone Number: " + this.phone);
    }

}
