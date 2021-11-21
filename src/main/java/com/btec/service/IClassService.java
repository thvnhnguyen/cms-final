package com.btec.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.btec.dto.ClassDTO;

public interface IClassService {
	List<ClassDTO> findAll(Pageable pageable);
	int getTotalItem();
	Map<Long, String> findAll();
}
