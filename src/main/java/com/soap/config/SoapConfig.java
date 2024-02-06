package com.soap.config;

import com.soap.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.soap.wsdl");
        return marshaller;
    }
    @Bean
    public SoapClient getSoapClient(Jaxb2Marshaller marshaller){
        SoapClient client = new SoapClient();
        client.setDefaultUri("http://istp1service.azurewebsites.net/LoginService.svc");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
