package com.tpe.repository;

import com.tpe.domain.Message;

public class DBRepo implements Repository {
    @Override
    public void save(Message message) {
        System.out.println("Your message is being saved into DB");
    }
}
