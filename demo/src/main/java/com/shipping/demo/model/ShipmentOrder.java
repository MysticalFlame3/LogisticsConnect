package com.shipping.demo.shipmentorder;
import com.shipping.demo.model.bulk_shipment_request;

import jakarta.persistence.*;

public enum ShipmentStatus{
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED;
}

@Entity
@Table(name="shipmentorder")
public class ShipmentOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @ManyToOne
    @JoinColumn(name = "request_id")
    public bulk_shipment_request request;
    public String tracking_id;
    public String courier;
    public ShipmentStatus status;
}