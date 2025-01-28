package com.jbk.SpringBoot_Cycle_CRUD_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Entity.Cycle_Entity;
import com.jbk.Service.Cycle_Service;

@RestController
public class Cycle_Controller {

	@Autowired
	Cycle_Service service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Cycle_Entity c) {
		String msg = service.insertdata(c);
		return msg;
	}

}
