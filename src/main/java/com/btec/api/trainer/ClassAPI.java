package com.btec.api.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btec.service.IClassService;

@RestController(value = "classAPIOfTrainer")
public class ClassAPI {
	
	@Autowired
	private IClassService classService;
	
	@DeleteMapping("/api/trainer/class")
	public void removeUser(@RequestBody String username, Long classId) {
		classService.removeUser(username, classId);
	}
}
