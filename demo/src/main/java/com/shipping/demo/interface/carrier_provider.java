package com.shipping.demo.carrierprovider;

import com.shipping.demo.shipmentorder.ShipmentOrder; 

public interface CarrierProvider {
    
    // Notice: camelCase. Takes the whole object. Returns a String. NO curly braces.
    String createShipment(ShipmentOrder order);
    
    // Update might just need the order ID, but let's pass the order for simplicity.
    String updateShipment(ShipmentOrder order);
    
    // Tracking usually just needs the tracking ID. Returns a status string.
    String trackShipment(String trackingId);
    
    // Canceling usually requires the tracking ID. Returns a boolean for success/fail.
    boolean cancelShipment(String trackingId);
}
