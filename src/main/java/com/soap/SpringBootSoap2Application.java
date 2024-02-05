package com.soap;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoap2Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoap2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoap2Application.class, args);
	}
	@Bean
	CommandLineRunner init(SoapClient soapClient) {
		return (args) -> {
			AddResponse response = soapClient.getAddResponse(1, 2);
			LOGGER.info("El resultado de la suma entre {} y {} es {}", 1, 2, response.getAddResult());
		};
	}
}
