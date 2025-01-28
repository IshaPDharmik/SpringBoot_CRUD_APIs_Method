package com.jbk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Entity.Product;
import com.jbk.Service.Product_Service;

@RestController
public class Product_Controller {

	@Autowired
	Product_Service service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Product P) {
		String msg = service.insertdata(P);
		return msg;
	}

	@DeleteMapping("/deletedata/{p_id}")
	public String deleteData(@PathVariable int p_id) {
		String msg = service.deletedata(p_id);
		return msg;
	}

	@PutMapping("/updatedata/{p_id}")
	public String updatedate(@RequestBody Product P, @PathVariable int p_id) {
		String msg = service.updatedata(P, p_id);
		return msg;
	}

	@GetMapping("/getAllData")
	public List<Product> getAllData() {
		List<Product> list = service.getAllData();
		return list;
	}

	@GetMapping("/getSingleData/{p_id}")
	public Product getSingleProduct(@PathVariable int p_id) {
		Product msg = service.getProduct(p_id);
		return msg;
	}
}