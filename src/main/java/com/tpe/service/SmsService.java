package com.tpe.service;

import com.tpe.domain.Message;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(Message message) {
        System.out.println("SMS Message service");
    }
}
