package com.restwithjenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restwithjenkins.entity.Message;
import com.restwithjenkins.service.MessageService;

@RestController
public class RestApiController {
	
	@Autowired
	MessageService msgService;
	
	@GetMapping("/message/{id}")
	public String getMessageById(@PathVariable Integer id) {
		return msgService.getMessageById(id);
	}

	
	@PostMapping("/addmessage")
	public Message addMessage(@RequestBody Message message){
		return msgService.addMessage(message);
	}
	@DeleteMapping("/deletemessage/{id}")
	public String deleteMessage(@PathVariable Integer id){
		return msgService.deleteMessage(id);
	}
}
