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

import com.jbk.Entity.Animals_Entity;
import com.jbk.Service.Animals_Service;

@RestController
public class Animals_Controller {

	@Autowired
	Animals_Service service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Animals_Entity A) {
		String msg = service.insertdata(A);
		return msg;
	}

	@DeleteMapping("/deletedata/{a_ID}")
	public String deleteData(@PathVariable int a_ID) {
		String msg = service.deletedata(a_ID);
		return msg;
	}

	@PutMapping("/updatedata/{a_ID}")
	public String updateData(@RequestBody Animals_Entity A, @PathVariable int a_ID) {
		String msg = service.updatedata(A, a_ID);
		return msg;
	}

	@GetMapping("/getAllData")
	public List<Animals_Entity> getAllData() {
		List<Animals_Entity> list = service.getAllData();
		return list;
	}

	@GetMapping("/getSingleData/{a_ID}")
	public Animals_Entity getSingleAnimals_Entity(@PathVariable int a_ID) {
		Animals_Entity msg = service.getAnimals_Entity(a_ID);
		return msg;
	}
}
