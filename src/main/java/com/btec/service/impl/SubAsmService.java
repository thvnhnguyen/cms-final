package com.btec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.btec.converter.SubasmConverter;
import com.btec.dto.AsmDTO;
import com.btec.dto.SubAsmDTO;
import com.btec.entity.AsmEntity;
import com.btec.entity.SubasmEntity;
import com.btec.repository.AsmRepository;
import com.btec.repository.ClassRepository;
import com.btec.repository.SubAsmRepository;
import com.btec.service.ISubAsmService;


@Service
public class SubAsmService implements ISubAsmService {

	@Autowired
	private SubAsmRepository subAsmRepository;
	
	@Autowired
	private SubasmConverter subAsmConverter;
	
	@Autowired
	private AsmRepository asmRepository;

	@Override
	public List<SubAsmDTO> findAll() {
		/*List<SubAsmDTO> subasms = new ArrayList<>();
		List<SubasmEntity> subasmentity = subAsmRepository.findAll();
		for (SubasmEntity subasmlist: subasmentity) {
			SubAsmDTO subAsmDTO = subAsmConverter.toDto(subasmlist);
			subasms.add(subAsmDTO);
		}
		return subasms;*/
		return null;
	}
	
	

	@Override
	public SubAsmDTO findById(long subAsmId) {
		SubasmEntity entity = subAsmRepository.findOne(subAsmId);
		return subAsmConverter.toDto(entity);
	}

	@Override
	@Transactional
	public SubAsmDTO savegrade(SubAsmDTO dto) {
		SubasmEntity oldSubasm = subAsmRepository.findOne(dto.getSubAsmId());
		SubasmEntity subasmEntity = new SubasmEntity();
		subasmEntity = subAsmConverter.toEntity(oldSubasm, dto);
		return subAsmConverter.toDto(subAsmRepository.save(subasmEntity));
	}



	@Override
	public List<SubAsmDTO> findByAsmId(Long asmId) {
		List<SubasmEntity> subasms = asmRepository.findOne(asmId).getSubasms();
		List<SubAsmDTO> subasmsDTO = new ArrayList<>();
		for (SubasmEntity item: subasms) {
			SubAsmDTO subasmDTO = subAsmConverter.toDto(item);
			subasmsDTO.add(subasmDTO);
		}
		return subasmsDTO;
	}

}
