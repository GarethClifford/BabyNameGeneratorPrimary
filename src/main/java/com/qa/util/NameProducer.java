package com.qa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.BabyName;
import com.qa.persistence.domain.Name;

@Component
public class NameProducer {
	
	private BabyName pojoName = new BabyName();
	
//	@Autowired
//	private JmsTemplate jmsTemplate;
	
	public String produce(Name name) {
		pojoName.setName(name.toString());
//		jmsTemplate.convertAndSend("BabyNames", pojoName);
		return "${successful.message}$";
	}

}
