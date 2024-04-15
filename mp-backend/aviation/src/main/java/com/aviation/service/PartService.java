package com.aviation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aviation.model.Part;
import com.aviation.repository.PartRepository;

@Service
public class PartService {
	@Autowired
	private PartRepository partRepository;

	public List<Part> getAllParts() {
		return partRepository.findAll();
	}
	public Optional<Part> getPartById(int id) {
		return partRepository.findById(id);
	}
	public Part savePart(Part part) {
		return partRepository.save(part);
	}
	public void deletePart(int id) {
        partRepository.deleteById(id);
    }
}
