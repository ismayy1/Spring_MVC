package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component ("fileRepo")
public class FileRepo implements Repository {

    @Override
    public void save(Message message) {
        System.out.println("Your message is being saved into File");
    }

}
