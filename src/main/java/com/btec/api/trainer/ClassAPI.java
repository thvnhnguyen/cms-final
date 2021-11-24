package com.btec.api.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btec.dto.ClassDTO;
import com.btec.service.IClassService;

@RestController(value = "classAPIOfTrainer")
public class ClassAPI {
	
	@Autowired
	private IClassService classService;
	
	@PutMapping("/api/class")
	public ClassDTO editClassPass(@RequestBody ClassDTO editpassDTO) {
		return classService.savepass(editpassDTO);
	}
}
