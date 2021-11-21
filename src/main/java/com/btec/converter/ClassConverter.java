package com.btec.converter;

import org.springframework.stereotype.Component;

import com.btec.dto.ClassDTO;
import com.btec.entity.ClassEntity;

@Component

public class ClassConverter {

	public ClassDTO toDto(ClassEntity entity) {
		ClassDTO result = new ClassDTO();
		result.setClassId(entity.getClassId());
		result.setClassName(entity.getClassName());
		result.setPassword(entity.getPassword());
		return result;
	}
	
	public ClassEntity toEntity(ClassDTO dto) {
		ClassEntity result = new ClassEntity();
		result.setClassName(dto.getClassName());
		result.setPassword(dto.getPassword());
		return result;
	}
	
}
