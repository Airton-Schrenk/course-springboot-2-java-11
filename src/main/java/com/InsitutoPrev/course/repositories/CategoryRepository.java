package com.InsitutoPrev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsitutoPrev.course.entities.Category;
//instancia um objeto repositorio
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
