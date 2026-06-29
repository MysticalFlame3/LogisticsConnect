package com.shipping.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="shipmentorder")
public class ShipmentOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public long request_id;
    
    public String tracking_id;
    public String courier;
    public ShipmentStatus status;

    public enum ShipmentStatus {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELLED;
    }
}