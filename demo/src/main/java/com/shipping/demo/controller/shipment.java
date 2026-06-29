package com.shipping.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.shipping.demo.dto.dto.CreateBulkShipmentDto;
import com.shipping.demo.dto.dto.ResponseShipment;
import com.shipping.demo.service.shipmentService;

@RestController
@RequestMapping("/api/v1/shipment")
public class shipment {

    private final shipmentService service;

    public shipment(shipmentService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ResponseShipment> createShipment(@RequestBody CreateBulkShipmentDto requestData){
        ResponseShipment res = service.processShipment(requestData);
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }
}
