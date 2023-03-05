package com.restwithjenkins.service;

import com.restwithjenkins.entity.Message;

public interface MessageService {
	
	public String getMessageById(Integer msgId);
	public Message addMessage(Message message);
	public String deleteMessage(Integer msgId);
}
