package com.InsitutoPrev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsitutoPrev.course.entities.Product;
//instancia um objeto repositorio
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
