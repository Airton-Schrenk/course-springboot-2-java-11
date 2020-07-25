package com.InsitutoPrev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsitutoPrev.course.entities.Order;
import com.InsitutoPrev.course.services.OrderService;

@RestController
@RequestMapping(value = "/Orders")
public class OrderResource {
	@Autowired
	private OrderService service;//dependencia para o service
	//camada de recurso
	//criar um método para ser entpoint
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		//Order u = new Order(1L, "Maria", "maria@gmail.com.", "9999999", "12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
