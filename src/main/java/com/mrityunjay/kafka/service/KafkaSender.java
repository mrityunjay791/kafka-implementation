package com.mrityunjay.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * This service is used for producing message to topic.
 * 
 * @author mrityunjaykumar
 *
 */
@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
//	private NewTopic topic1;
	
	
	// Topic name
	String kafkaTopic = "Mrityunjay-kafka-test";

	/**
	 * Used to send message to kafka topic.
	 * 
	 * @param message
	 */
	public void send(String message) {
		kafkaTemplate.send(kafkaTopic, message);
	}
}