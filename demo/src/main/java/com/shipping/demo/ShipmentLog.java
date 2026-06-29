package com.shipping.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ShipmentLog {
    @Id
    private String order_id;
    private String status;
}