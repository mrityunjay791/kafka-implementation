Command for mac os:-
[Please don't use command with $]
Start Zookeeper:-

	$sh bin/zookeeper-server-start.sh config/zookeeper.properties

Start Kafka:-

	$ sh bin/kafka-server-start.sh config/server.properties

Create Topic:-

	$ sh bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mj-kafka-test


Start Producer to produce messages:-

	$ sh bin/kafka-console-producer.sh  --broker-list localhost:9092 --topic mj-kafka-test
-Now enter massage to send consumer..

Start consumer to consume messages:-

	$ sh bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mj-kafka-test --from-beginning
	

Go to the Apache Kafka downloads page and download the https://kafka.apache.org/download the Scala 2.12 kafka_2.12-0.10.2.1.tgz

Next unzip it to a particular location-

Start Apache Kafka-

This Kafka installation comes with an inbuilt zookeeper. Zookeeper is mainly used to track status of nodes present in Kafka cluster and also to keep track of Kafka topics, messages, etc.
Open a command prompt and start the Zookeeper-

	C:\kafka_2.12-0.10.2.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties [FOR WINDOWS]

	$ sh bin/zookeeper-server-start.sh config/zookeeper.properties [FOR MAC OS]

      4.	Open a new command prompt and start the Apache Kafka
	C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-server-start.bat .\config\server.properties [FOR WINDOWS]
	$ sh bin/kafka-server-start.sh config/server.properties [FOR MAC OS]

   5. Open a new command prompt and create a topic with name mrityunjay-topic-test, that has only one partition & one replica.	
   
	C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mrityunjay-topic-test [FOR WINDOWS]
	$ sh bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mrityunjay-topic-test [FOR MAC OS]

6. Next Open a new command prompt and create a producer to send message to the above created mrityunjay-topic-test and send a message - Hello World Mrityunjay to it-

	C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic mrityunjay-topic-test 
[FOR WINDOWS]

> Hello World @MJ

	$ sh bin/kafka-console-producer.sh  --broker-list localhost:9092 --topic mrityunjay-topic-test
[FOR MAC OS]

> Hello world @MJ

7.  Finally Open a new command prompt and start the consumer which listens to the topic mrityunjay-topic-test we just created above. We will get the message we had sent using the producer

	C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic mrityunjay-topic-test --from-beginning [FOR WINDOWS]
	
	$ sh bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mrityunjay-topic-test --from-beginning


Project on github:-

	https://github.com/mrityunjay791/kafka-implementation.git
