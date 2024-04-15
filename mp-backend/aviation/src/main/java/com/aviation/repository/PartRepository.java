package com.aviation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aviation.model.Part;


public interface PartRepository extends JpaRepository<Part, Integer>{

}
