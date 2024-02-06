package com.soap.client;

//import com.soap.wsdl.*;

import com.soap.wsdl.*;
import jakarta.xml.bind.JAXBElement;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {
    public SolicitarAutorizacionResponse getSolicitarAutorizacionResponse(String codigo) {
        SolicitarAutorizacion autorizacionRequest = new SolicitarAutorizacion();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> codigoJaxb = factory.createSolicitarAutorizacionCodigo(codigo);
        autorizacionRequest.setCodigo(codigoJaxb);
        SoapActionCallback actionCallback = new SoapActionCallback("http://ISTP1.Service.Contracts.Service/ILoginService/SolicitarAutorizacion");
        return (SolicitarAutorizacionResponse) getWebServiceTemplate().marshalSendAndReceive("http://istp1service.azurewebsites.net/LoginService.svc", autorizacionRequest, actionCallback);

    }

}
