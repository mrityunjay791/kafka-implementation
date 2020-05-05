package com.mrityunjay.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.kafka.service.KafkaSender;
/**
 * This controller will be used for publishing messages.
 * 
 * For getting correct output we need to start zookeeper and kafka.
 * 
 * @author mrityunjaykumar
 *
 */
@RestController
@RequestMapping(value = "/mj-kafka/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic mj-topic-test Successfully";
	}

}