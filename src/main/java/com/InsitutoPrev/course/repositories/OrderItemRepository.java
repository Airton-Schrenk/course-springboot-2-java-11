package com.InsitutoPrev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsitutoPrev.course.entities.OrderItem;
//instancia um objeto repositorio
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
