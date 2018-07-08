package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/kafka")
public class ProducerController {
	
	
	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;

	/*@Autowired
	KafkaTemplate<String, String> stringKafkaTemplate;
	
	@GetMapping("/publish/string/{message}")
	public String publishStringMessage(@PathVariable String message) {
		stringKafkaTemplate.send("test", message);
		return "Message Published";
	}*/
	
	@PostMapping("/publish/object")
	public String publishObjectMessage(@RequestBody User user) {
		System.out.println(user);
		kafkaTemplate.send("test", user);
		return "Object Published";
	}

}
