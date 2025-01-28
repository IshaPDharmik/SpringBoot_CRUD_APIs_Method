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

import com.jbk.Entity.Bike_Entity;
import com.jbk.Service.Bike_Service;

@RestController
public class Bike_Controller {

	@Autowired
	Bike_Service service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Bike_Entity B) {
		String msg = service.insertdata(B);
		return msg;
	}

	@DeleteMapping("/deletedata/{b_Id}")
	public String deleteData(@PathVariable int b_Id) {
		String msg = service.deletedata(b_Id);
		return msg;
	}

	@PutMapping("/deletedata/{b_Id}")
	public String updateData(@RequestBody Bike_Entity B, @PathVariable int b_Id) {
		String msg = service.updatedata(B, b_Id);
		return msg;
	}

	@GetMapping("/getAllData")
	public List<Bike_Entity> getAllData() {
		List<Bike_Entity> list = service.getAllData();
		return list;
	}

	@GetMapping("/getSingleRecord/{c_id}")
	public Bike_Entity getSingleBike_Entity(@PathVariable int c_id) {
		Bike_Entity msg =service. getBike_Entity(c_id);
		return msg;
	}
}
