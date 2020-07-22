package com.InsitutoPrev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsitutoPrev.course.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	//camada de recurso
	//criar um método para ser entpoint
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com.", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
