package com.btec.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.btec.dto.AsmDTO;
import com.btec.dto.ClassDTO;
import com.btec.dto.UserDTO;
import com.btec.entity.AsmEntity;

public interface IClassService {
	List<ClassDTO> findAll(Pageable pageable);
	List<AsmDTO> findByClassId(Long classId);
	int getTotalItem();
	Map<Long, String> findAll();
	ClassDTO findOne(Long classId);
	ClassDTO save(ClassDTO dto);
	List<ClassDTO> showClassByUsername(String username, Pageable pageable);
	void delete(Long classId);
	int getTrainerTotalItem(String username);
	List<UserDTO> listTraineeOfClass(Long classId, String username);
	void removeUser(String username, Long classId);
}
