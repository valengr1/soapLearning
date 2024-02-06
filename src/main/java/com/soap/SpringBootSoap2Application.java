package com.soap;

import com.soap.client.SoapClient;
import com.soap.wsdl.Autorizacion;
import com.soap.wsdl.SolicitarAutorizacionResponse;
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
			SolicitarAutorizacionResponse response = soapClient.getSolicitarAutorizacionResponse("222D6106-B8FA-4F08-B0E6-A2E89AE02247");
			LOGGER.info(response.getSolicitarAutorizacionResult().getValue().getPuntoVenta().toString());
		};
	}
}
