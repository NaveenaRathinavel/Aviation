package com.aviation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aviation.model.Part;
import com.aviation.model.PartRequest;
import com.aviation.repository.PartRequestRepository;

@Service
public class PartRequestService {
	@Autowired
	private PartRequestRepository partRequestRepository;
	public List<PartRequest> getAllPartRequests(){
		return partRequestRepository.findAll();
	}
	
	public Optional<PartRequest> getPartRequestById(int id) {
		return partRequestRepository.findById(id);
	}
	public PartRequest savePartRequest(PartRequest partRequest) {
		return partRequestRepository.save(partRequest);
	}
	public void deletePartRequest(int id) {
        partRequestRepository.deleteById(id);
    }
}
