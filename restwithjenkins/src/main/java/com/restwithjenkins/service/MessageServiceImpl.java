package com.restwithjenkins.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restwithjenkins.entity.Message;
import com.restwithjenkins.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository repo;	
	@Override
	public String getMessageById(Integer msgId) {
		Optional<Message> msg = repo.findById(msgId);
		if(msg.isPresent()) {
			return msg.get().getMsg();
		}else {
			return null;
		}
		
	}

	/*
	 * @Override public Message getMessageByMsg(String msg) { return
	 * repo.findByMsg(msg); }
	 */

	@Override
	public Message addMessage(Message message) {
		
		return repo.save(message);
	}

	@Override
	public String deleteMessage(Integer msgId) {
		Optional<Message> message = repo.findById(msgId);
		if(message.isPresent()) {
			repo.deleteById(message.get().getMsgId());
			return "Message deleted successfully";
		}else {
			return "Unable to delete message as it doesn't exist in our record";
		}
		
	}

}
