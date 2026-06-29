package com.shipping.demo.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CreateBulkShipmentDto{
    @NotBlank
    private String address;
    @Min(6)
    @Pattern(regexp = "^[0-9]{6}$")
    private int pincode;
    @NotBlank
    private String payment_status;
    @Min(value = 0,message="")
    private double amount;
    private String courier;
    private String tracking_id;
    private String note;
}

@Data
public class ResponseShipment {
    private String tracking_id;
    private String message;

    public ResponseShipment(String tracking_id, String message){
        this.tracking_id = tracking_id;
        this.message = message;
    }
}
