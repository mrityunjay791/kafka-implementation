package com.mrityunjay.kafka.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * This class will be used for consuming messages from specified kafka topic.
 * 
 * @author mrityunjaykumar
 *
 */
@Service
public class Consumer {

	/**
	 * Listening/Consuming kafka messages.
	 * 
	 * @param message
	 * @throws IOException
	 */
    @KafkaListener(topics = "Mrityunjay-kafka-test", groupId = "group_id")
    public void consume(String message) throws IOException {
         System.out.println(message);
    }
}