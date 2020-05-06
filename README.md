What is Apache Kafka?
=

Apache Kafka is an open-source stream-processing software platform developed by LinkedIn and donated to the Apache Software Foundation. It has been developed using Java and Scala. Apache Kafka is a high throughput distributed messaging system for handling real-time data feeds.

Applications now follow microservices architecture. So we have a distributed architecture where number of systems interact with each other. Applications now create and process lot of data. Complex web of applications involving point to point data movement. This involves moving large amount of data from one point to another.


The obvious choice to resolve above issue is to use a messaging system. 
But traditional messaging systems have following drawback:-

	Traditional Messaging System	Apache   |  Kafka
	Limited Scalibility					|  Scalable
	Transient in-memory persistence		|  Messages also stored in replicated log
	Comparatively lower throughput			|  Comparatively higher throughput





So Apache Kafka is a much Reliable and high throughput streaming system that can move large amount of data between applications.

Understanding Apache Kafka Architecture:-
=
Apache Kafka Topic:-

	Apache Kafka is a messaging system where messages are sent by producers and these messages are consumed by one or more consumers. Producers send the messages to Apache Kafka Topics. From the topics these messages are then consumed by the consumers. Topics have unique names which are used by producers and consumers for sending/consuming messages.
	
	Topics are the base abstraction of where data lives within Kafka. They can be considered similar to the concept of table in a database. Each topic is backed by logs which are partitioned and distributed.

Apache Kafka Broker:-
=

	The physical/virtual machines or servers where topics reside are called brokers. Kafka Broker is a software process that runs on machine. Broker has access to resources such as file systems where logs are maintained. A single topic can have multiple partitions running on different brokers.


The advantages of using Apache Kafka Cluster are as follows:-
=

	Clustering - Apache Kafka has a clustered set of brokers that work in unison.
	
	Distributed - The data in Apache Kafka is distributed in all the brokers. This is done by making use of partitions which are distributed across multiple brokers.
	
	Fault Tolerant - Apache Kafka maintains replicated copies of data. So if any broker in the cluster goes down, it does not affect the working of Apache Kafka Cluster. This is done by setting the replication value to greater than 1.
	
	Application scaling - Apache Kafka can be scaled horizontally. This increases the throughput.


Apache Zookeeper:-
=

	To manage the cluster we make use of Apache Zookeeper. Apache Zookeeper is a coordination service for distributed application that enables synchronization across a cluster. Zookeeper can be viewed as centralized repository where distributed applications can put data and get data out of it. It is used to keep the distributed system functioning together as a single unit, using its synchronization, serialization and coordination goals, selecting leader node.
	
Internal Working Of Apache Kafka:-
=

Topics are the base abstraction of where data lives within Kafka. They can be considered similar to the concept of table in a database. Each topic is backed by logs which are partitioned and distributed.

Each Message has a timestamp Identifier Binary Payload
Apache Kafka Message

![alt text](/kafka-implementation/src/main/resources/static/images/test.png)

Command for mac os:-
=

[Please don't use command with $]

Start Zookeeper:-
=

	$sh bin/zookeeper-server-start.sh config/zookeeper.properties

Start Kafka:-
=

	$ sh bin/kafka-server-start.sh config/server.properties

Create Topic:-
=

	$ sh bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mj-kafka-test


Start Producer to produce messages:-
=

	$ sh bin/kafka-console-producer.sh  --broker-list localhost:9092 --topic mj-kafka-test
-Now enter massage to send consumer..

Start consumer to consume messages:-
=

	$ sh bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mj-kafka-test --from-beginning
	
	
Install Kafka:-
=

Go to the Apache Kafka downloads page and download the https://kafka.apache.org/download the Scala 2.12 kafka_2.12-0.10.2.1.tgz

Next unzip it to a particular location-

Start Apache Kafka:-
=

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
=

	https://github.com/mrityunjay791/kafka-implementation.git
	
Interview Questions:-
=
	
Q: What is Apache Kafka?

	A: Apache Kafka is a distributed publish-subscribe messaging system. It is a scalable, fault-tolerant, publish-subscribe messaging system which enables us to build distributed applications. It is an Apache Top Level project. Kafka is suitable for both offline and online message consumption.

Q: What are the advantages of using Apache Kafka?
	A: The Advantages of using Apache Kafka are as follows-
	
	High Throughput:- The design of Kafka enables the platform to process messages at very fast speed. The processing rates in Kafka can exceed beyond 100k/seconds. The data is processed in a partitioned and ordered fashion.
	
	Scalability:- The scalability can be achieved in Kafka at various levels. Multiple producers can write to the same topic. Topics can be partitioned. Consumers can be grouped to consume individual partitions.

	Fault Tolerance:-Kafka is a distributed architecture which means there are several nodes running together to serve the cluster. Topics inside Kafka are replicated. Users can choose the number of replicas for each topic to be safe in case of a node failure. Node failure in cluster wonâ€™t impact. Integration with Zookeeper provides producers and consumers accurate information about the cluster. Internally each topic has its own leader which takes care of the writes. Failure of node ensures new leader election.

	Durability:-Kafka offers data durability as well. The message written in Kafka can be persisted. The persistence can be configured. This ensures re-processing, if required, can be performed.

Q: How to get started with Apache Kafka?

	A: Please see above , added command to start kafka and zookeeper already.



Q: What are the scenarios you will use Apache Kafka?

	A: Real time example of Apache Kafka is Uber cab booking service. Uber makes use of Kafka to send User and Cab information to Uber Cab Booking System.
	
Uber Using Apache Kafka
=
What is Apache Kafka

Q: Define architecture of Apache Kafka?

	A: Apache Kafka is a messaging system where messages are sent by producers and these messages are consumed by one or more consumers. Producers send the messages to Apache Kafka Topics. From the topics these messages are then consumed by the consumers. Topics have unique names which are used by producers and consumers for sending/consuming messages.
	
	Topics are the base abstraction of where data lives within Kafka. They can be considered similar to the concept of table in a database. Each topic is backed by logs which are partitioned and distributed.
	
Apache Kafka Topic
=

Q: What is Kafka Logs?

	A: An important concept for Apache Kafka is a log. This is not related to application log or system log. This is a log of the data. It creates a loose structure of the data which is consumed by Kafka. The notion of â€œlogâ€ is an ordered, append-only sequence of data. The data can be anything because for Kafka it will be just an array of bytes.

Q: When not to use Apache Kafka?

	A:Kafka doesnot number the messages. It has a notion of a offset inside the log which identifies the messages.
	
	Consumers consume the data from topics but Kafka does not keep track of the message consumption. Kafka does not know which consumer consumed which message from the topic. The consumer or consumer group has to keep a track of the consumption.
	
	There are no random reads from Kafka. Consumer has to mention the offset for the topic and Kafka starts serving the messages in order from the given offset.
	
Kafka does not offer the ability to delete. The message stays via logs in Kafka till it expires (until the retention time defined).
=

