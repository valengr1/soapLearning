package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {
    /**
     * Metodo para sumar dos números
     * @param a
     * @param b
     * @return
     */
    public AddResponse getAddResponse(int a, int b) {
        Add addRequest = new Add();
        addRequest.setIntA(a);
        addRequest.setIntB(b);
        SoapActionCallback actionCallback = new SoapActionCallback("http://tempuri.org/Add");
        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, actionCallback);
    }
    /**
     * Metodo para restar dos números
     * @param a
     * @param b
     * @return
     */
    public SubtractResponse getSubtractResponse(int a, int b) {
        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(a);
        subtractRequest.setIntB(b);
        SoapActionCallback actionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest, actionCallback);
    }
    /**
     * Metodo para multiplicar dos números
     * @param a
     * @param b
     * @return
     */
    public MultiplyResponse getMultiplyResponse(int a, int b) {
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(a);
        multiplyRequest.setIntB(b);
        SoapActionCallback actionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
        return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiplyRequest, actionCallback);
    }

    /**
     * Metodo para dividir dos números
     * @param a
     * @param b
     * @return
     */
    public DivideResponse getDivideResponse(int a, int b) {
        Divide divideRequest = new Divide();
        divideRequest.setIntA(a);
        divideRequest.setIntB(b);
        SoapActionCallback actionCallback = new SoapActionCallback("http://tempuri.org/Divide");
        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, actionCallback);
    }

}
