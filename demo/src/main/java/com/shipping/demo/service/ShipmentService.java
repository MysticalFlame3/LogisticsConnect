package com.shipping.demo.service;

import org.springframework.stereotype.Service;
import com.shipping.demo.dto.dto.CreateBulkShipmentDto;
import com.shipping.demo.dto.dto.ResponseShipment; 
import com.shipping.demo.interface_pkg.carrier_provider;
import com.shipping.demo.model.ShipmentOrder;

@Service
public class shipmentService {
    private final carrier_provider provider;
    
    public shipmentService(carrier_provider provider) {
        this.provider = provider;
    }
    
    public ResponseShipment processShipment(CreateBulkShipmentDto requestData) {
        ShipmentOrder order = new ShipmentOrder();
        order.setCourier(requestData.getCourier());

        String generatedTrackingId = provider.createShipment(order);
        
        return new ResponseShipment(generatedTrackingId, "Shipment successfully initiated with carrier.");
    }
}
