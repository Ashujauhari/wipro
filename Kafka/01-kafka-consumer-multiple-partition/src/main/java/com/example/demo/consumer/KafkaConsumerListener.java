package com.example.demo.consumer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {
	
	Logger log = LoggerFactory.getLogger(KafkaConsumerListener.class);
	
	 @KafkaListener(topics = "kafka-topic-demo",groupId="mygroup-1")
	 public void consume4(String message) {
		 log.info("consumer consume the message {} ", message);
		 }
}
