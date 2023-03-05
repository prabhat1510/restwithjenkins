package com.restwithjenkins.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restwithjenkins.entity.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

}
