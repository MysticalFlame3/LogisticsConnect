package com.shipping.demo.interface_pkg;
import com.shipping.demo.model.ShipmentOrder;

public interface carrier_provider {
    public String createShipment(ShipmentOrder order);
    public String updateShipment(ShipmentOrder order);
    public String trackShipment(String trackingId);
    public boolean cancelShipment(String trackingId) throws Exception;
}
