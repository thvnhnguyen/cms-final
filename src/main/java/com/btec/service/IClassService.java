package com.btec.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.btec.dto.AsmDTO;
import com.btec.dto.ClassDTO;
import com.btec.entity.AsmEntity;

public interface IClassService {
	List<ClassDTO> findAll(Pageable pageable);
	List<AsmDTO> findByClassId(Long classId);
	int getTotalItem();
	Map<Long, String> findAll();
	ClassDTO findOne(Long classId);
	ClassDTO save(ClassDTO dto);
}
