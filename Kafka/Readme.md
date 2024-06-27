# Kafak Installation

## Download Kafka 

## Setup Kafka

### Open Source Kafka Startup in local
#### Start Zookeeper Server  in mac
`sh bin/zookeeper-server-start.sh config/zookeeper.properties`

#### Start Zookeeper Server in windows
zookeeper-server-start.sh config/zookeeper.properties

#### Start Kafka Server / Broker in mac
`sh bin/kafka-server-start.sh config/server.properties`

#### Start Kafka Server / Broker in windows
`kafka-server-start.bat config/server.properties`

#### Create topic in mac
`sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --topic NewTopic --partitions 3 --replication-factor 1`
#### Create topic in windows
kafka-topics.bat --bootstrap-server localhost:9092 --create --topic NewTopic --partitions 3 --replication-factor 1


#### list out all topic names in mac
` sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --list`
#### list out all topic names in windows
`kafka-topics.bat --bootstrap-server localhost:9092 --list`

#### Describe topics in mac
` sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic NewTopic`
#### Describe topics in windows
`kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic NewTopic`

#### Produce message
`sh bin/kafka-console-producer.sh --broker-list localhost:9092 --topic NewTopic`
#### Produce message
kafka-console-producer.bat --broker-list localhost:9092 --topic NewTopic

#### consume message in mac
`sh bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic NewTopic --from-beginning`

#### consume message in windows
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NewTopic --from-beginning



