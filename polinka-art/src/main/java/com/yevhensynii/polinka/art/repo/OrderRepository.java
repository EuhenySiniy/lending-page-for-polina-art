package com.yevhensynii.polinka.art.repo;

import com.yevhensynii.polinka.art.models.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
  OrderEntity getOrderById(Long id);
}
