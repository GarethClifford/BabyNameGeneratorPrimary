package com.qa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.Name;

@Component
public class NameProducer {
	
	private Name pojoName = new Name();
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public String produce(Name name) {
		pojoName.setNameStartingWith(name.toString());
		jmsTemplate.convertAndSend("BabyNames", pojoName);
		return "${successful.message}$";
	}

}
