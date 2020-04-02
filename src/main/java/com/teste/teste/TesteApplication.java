package com.teste.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		TestXML testXML = new TestXML(restTemplate);

		testXML.mapXml();
	}

}
