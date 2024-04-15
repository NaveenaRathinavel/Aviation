package com.aviation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aviation.model.Part;
import com.aviation.model.PartRequest;
import com.aviation.service.PartRequestService;
import com.aviation.service.PartService;

@RestController
@RequestMapping("/PartRequests")
@CrossOrigin(origins = "*")
public class PartRequestController {
	@Autowired
	private PartRequestService partRequestService;
	
	@GetMapping
	public List<PartRequest> getAllPartRequests(){
		return partRequestService.getAllPartRequests();
	}
	@GetMapping("/{id}")
	public Optional<PartRequest> getPart(@PathVariable("id") int id) {
		return partRequestService.getPartRequestById(id);
	}
	@PostMapping
	public PartRequest createPartRequest(@RequestBody PartRequest partRequest) {
		return partRequestService.savePartRequest(partRequest);
	}
	@DeleteMapping("/{id}")
    public void deletePartRequest(@PathVariable int id) {
        partRequestService.deletePartRequest(id);
    }

}