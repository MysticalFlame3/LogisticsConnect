package com.shipping.demo.repositories;

import com.shipping.demo.ShipmentLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<ShipmentLog, String> {
}
