package com.btec.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.btec.dto.SubAsmDTO;

public interface ISubAsmService {
	List<SubAsmDTO> findAll();
	SubAsmDTO findById(long subAsmId);
	SubAsmDTO savegrade(SubAsmDTO dto);
}