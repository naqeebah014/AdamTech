package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.OrderItem;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
