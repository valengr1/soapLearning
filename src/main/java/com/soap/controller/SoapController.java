package com.soap.controller;

//import com.soap.client.SoapClient;
//import com.soap.wsdl.AddResponse;
//import com.soap.wsdl.DivideResponse;
//import com.soap.wsdl.MultiplyResponse;
//import com.soap.wsdl.SubtractResponse;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SoapController {
//    private SoapClient soapClient;
//
//    public SoapController(SoapClient soapClient) {
//        this.soapClient = soapClient;
//    }
//
//    @PostMapping("/sumar")
//    public ResponseEntity<?> add(@RequestParam int a,@RequestParam int b) {
//        AddResponse addResponse = soapClient.getAddResponse(a, b);
//        Map<String, Integer> response = new HashMap<>();
//        response.put("resultado", addResponse.getAddResult());
//        return ResponseEntity.ok().body(response);
//    }
//
//    @PostMapping("/restar")
//    public ResponseEntity<?> subtract(@RequestParam int a,@RequestParam int b) {
//        SubtractResponse subtractResponse = soapClient.getSubtractResponse(a, b);
//        Map<String, Integer> response = new HashMap<>();
//        response.put("resultado", subtractResponse.getSubtractResult());
//        return ResponseEntity.ok().body(response);
//    }
//
//    @PostMapping("/multiplicar")
//    public ResponseEntity<?> multiply(@RequestParam int a,@RequestParam int b) {
//        MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(a, b);
//        Map<String, Integer> response = new HashMap<>();
//        response.put("resultado", multiplyResponse.getMultiplyResult());
//        return ResponseEntity.ok().body(response);
//    }
//
//    @PostMapping("/dividir")
//    public ResponseEntity<?> divide(@RequestParam int a,@RequestParam int b) {
//        DivideResponse divideResponse = soapClient.getDivideResponse(a, b);
//        Map<String, Integer> response = new HashMap<>();
//        response.put("resultado", divideResponse.getDivideResult());
//        return ResponseEntity.ok().body(response);
//    }
}
