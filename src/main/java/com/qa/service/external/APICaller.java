package com.qa.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.qa.persistence.domain.Name;

import com.qa.util.NameProducer;

@Component
public class APICaller {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private NameProducer nameProducer;

	@Value("${URL.generator.base}" + "${URL.generator.method}")
	private String nameURL;

	@Value("${URL.name.base}" + "${URL.name.method}")
	private String thingURL;

	public String getBabyName(Long lengthOfName, String nameStartingWith) {
		return restTemplate.getForObject("http://localhost:8082/getName/" + lengthOfName +"/" + nameStartingWith, String.class);
	}


	public void persist(Name name) {
		nameProducer.produce(name);
	}

}
