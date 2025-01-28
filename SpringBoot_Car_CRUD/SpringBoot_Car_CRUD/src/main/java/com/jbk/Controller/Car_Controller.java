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

import com.jbk.Entity.Car_Entity;
import com.jbk.Service.Car_Service;

@RestController
public class Car_Controller {

	@Autowired
	Car_Service service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Car_Entity C) {
		String msg = service.insertdata(C);
		return msg;
	}

	@DeleteMapping("/deletedata/{c_id}")
	public String deleteData(@PathVariable int c_id) {
		String msg = service.deletedata(c_id);
		return msg;
	}

	@PutMapping("/updatedata/{c_id}")
	public String updateData(@RequestBody Car_Entity C, @PathVariable int c_id) {
		String msg = service.updatedata(C, c_id);
		return msg;
	}

	@GetMapping("/getAllData")
	public List<Car_Entity> getAllData() {
		List<Car_Entity> list = service.getAllData();
		return list;
	}

	@GetMapping("/getSingleRecord/{c_id}")
	public Car_Entity getSingleCar_Entity(@PathVariable int c_id) {
		Car_Entity msg = service.getCar_Entity(c_id);
		return msg;
	}
}
