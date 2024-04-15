package com.aviation.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aviation.model.PartRequest;
public interface PartRequestRepository extends JpaRepository<PartRequest, Integer>{

}
