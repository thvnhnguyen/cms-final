package com.btec.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.btec.converter.ClassConverter;
import com.btec.dto.ClassDTO;
import com.btec.entity.ClassEntity;
import com.btec.repository.ClassRepository;
import com.btec.service.IClassService;

@Service

public class ClassService implements IClassService {

	@Autowired
	private ClassRepository classRepository;
	
	@Autowired
	private ClassConverter classConverter;
	@Override
	public List<ClassDTO> findAll(Pageable pageable) {
		List<ClassDTO> models = new ArrayList<>();
		List<ClassEntity> entities = classRepository.findAll(pageable).getContent();
		for (ClassEntity classlist: entities) {
			ClassDTO classDTO = classConverter.toDto(classlist);
			models.add(classDTO);
		}
		return models;
	}
	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return (int) classRepository.count();
	}
	@Override
	public Map<Long, String> findAll() {
		Map<Long, String> result = new HashMap<>();
		List<ClassEntity> entities = classRepository.findAll();
		for (ClassEntity item: entities) {
			result.put(item.getClassId(), item.getClassName());
		}
		return result;
	}

}
