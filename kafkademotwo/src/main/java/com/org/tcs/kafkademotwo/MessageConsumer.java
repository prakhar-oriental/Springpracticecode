package com.org.tcs.kafkademotwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
  private Logger log = LoggerFactory.getLogger(MessageConsumer.class);
  @Autowired
  private MessageRepository messageRepo;
  @KafkaListener(topics= "${myapp.kafka.topic}",groupId="xyx")
  public void consume(String message) {
	  log.info("message recieved at consumeer end ->"+message);
	  messageRepo.addMessage(message);
  }
}
