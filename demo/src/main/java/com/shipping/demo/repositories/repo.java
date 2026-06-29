import com.shipping.demo.reposutories;

import com.shipping.demo.entities.ShipmentLog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentLogRepository extends JpaRepository<ShipmentLog, String> {
    
    
}