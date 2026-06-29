package com.shipping.demo.model;
import jakarta.persistance.*;

@Entity
@Data
@Table(name = "bulk_shipment_request")
public class bulk_shipment_request{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long id;
    public String address;
    public int pincode;
    public String status;
    public String payment_status;
    public double amount;
    public String courier;
    public String tracking_id;
    public String note;
}