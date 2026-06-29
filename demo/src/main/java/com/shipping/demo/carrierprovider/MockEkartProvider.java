package com.shipping.demo.carrierprovider;

import org.springframework.stereotype.Service;
import com.shipping.demo.model.ShipmentOrder;
import com.shipping.demo.interface_pkg.carrier_provider;
import java.util.UUID;

@Service
public class MockEkartProvider implements carrier_provider {
    
    @Override
    public String createShipment(ShipmentOrder order){
        String trackingid = "Ekart"+UUID.randomUUID().toString();
        System.out.println("[MOCK EKART] Connecting to Ekart API...");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return trackingid;
    }

    @Override
    public String updateShipment(ShipmentOrder order) {
        return "UPDATE-SUCCESS";
    }
    
    @Override
    public String trackShipment(String trackingId) {
        return "IN_TRANSIT";
    }
    
    @Override
    public boolean cancelShipment(String trackingId) throws Exception {
        throw new Exception("Ekart down");
    }
}