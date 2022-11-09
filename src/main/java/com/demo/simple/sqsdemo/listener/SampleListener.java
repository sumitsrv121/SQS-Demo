package com.demo.simple.sqsdemo.listener;

import com.demo.simple.sqsdemo.entity.MessageObject;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleListener {
    @SqsListener(value = "${queue.first-queue}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void listenToFirstQueue(String message) {
        log.info("Received message from first queue {}", message);
        log.info("===============================================================");
    }

    @SqsListener(value = "${queue.secondQueue}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void listenToSecondQueue(MessageObject message) {
        log.info("Received a message on second queue: {}", message);
        log.info("===============================================================");
    }
}
