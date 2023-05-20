package org.jsp.sample.repository;

import org.jsp.sample.dto.sample;
import org.springframework.data.jpa.repository.JpaRepository;

import lombok.Data;

public interface samplerepository extends JpaRepository<sample, Integer>{
	

}
