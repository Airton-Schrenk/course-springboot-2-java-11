package com.InsitutoPrev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsitutoPrev.course.entities.User;
//instancia um objeto repositorio
public interface UserRepository extends JpaRepository<User, Long>{
	
}
