package com.shipping.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.shipping.demo.dtos.CreateBulkShipmentDto;
import com.shipping.demo.dtos.ResponseShipment;
import com.shipping.demo.service.ShipmentService;

@RestController
@RequestMapping("/api/v1/shipment")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService){
        this.shipmentService = shipmentService;
    }

    @PostMapping
    public ResponseEntity<ResponseShipment> createShipment(@RequestBody CreateBulkShipmentDto requestData){
        ResponseShipment shipment = shipmentService.processShipment(requestData);
        return ResponseEntity.status(HttpStatus.CREATED).body(shipment);
    }
}