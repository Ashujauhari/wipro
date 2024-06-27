package com;
/*Note: Make zookeeper is started
 

	1. Start Zookeeper Server
		(base) ashujauhari@Ashus-MacBook-Air bin % sh bin/zookeeper-server-start.sh config/zookeeper.properties
	2. Start Kafka Server / Broker
												  sh bin/kafka-server-start.sh config/server.properties
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//http://localhost:9191/producer-app/publish/Welcome1
//http://localhost:9191/producer-app/publish/Hello
@SpringBootApplication
public class KafkaProducerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerExampleApplication.class, args);
	}

}
