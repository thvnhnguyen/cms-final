package com.btec.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.btec.entity.AsmEntity;

public interface AsmRepository extends JpaRepository<AsmEntity, Long> {
	List<AsmEntity> findAllByclass(final Long classId, Pageable pageable);
}
