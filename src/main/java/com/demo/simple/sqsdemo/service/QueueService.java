package com.demo.simple.sqsdemo.service;

import com.amazonaws.services.sqs.model.SendMessageResult;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface QueueService {
    SendMessageResult sendSqsMessage(String queue, Object message) throws JsonProcessingException;
}
