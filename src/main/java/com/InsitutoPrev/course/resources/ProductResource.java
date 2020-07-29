package com.InsitutoPrev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsitutoPrev.course.entities.Product;
import com.InsitutoPrev.course.services.ProductService;

@RestController
@RequestMapping(value = "/Products")
public class ProductResource {
	@Autowired
	private ProductService service;//dependencia para o service
	//camada de recurso
	//criar um método para ser entpoint
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		//Product u = new Product(1L, "Maria", "maria@gmail.com.", "9999999", "12345");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
