Sample Spring Boot With Kafka
============================
An api is exposed which consumes json message and publishes into kafka topic 

## To start the zookeeper and kafka via docker compose:

`docker-compose up`

## TO create a topic:

`bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test`

## To start a producer:

`bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test`

## To Start a consumer:

`bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning`

## Definition:
Kafka is used for building real-time data pipelines and streaming apps. It is horizontally scalable, fault-tolerant, wicked fast, and runs in production in thousands of companies.

