package com.InsitutoPrev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsitutoPrev.course.entities.Order;
//instancia um objeto repositorio
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
