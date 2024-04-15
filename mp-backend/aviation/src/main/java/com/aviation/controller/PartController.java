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
import com.aviation.service.PartService;
@RestController
@RequestMapping("/parts")
@CrossOrigin(origins = "*")
public class PartController {
	@Autowired
	private PartService partService;
	
	@GetMapping
	public List<Part> getAllParts(){
		return partService.getAllParts();
	}
	@GetMapping("/{id}")
	public Optional<Part> getPart(@PathVariable("id") int id) {
		return partService.getPartById(id);
	}
	@PostMapping
	public Part createPart(@RequestBody Part part) {
		return partService.savePart(part);
	}
	@DeleteMapping("/{id}")
    public void deletePart(@PathVariable int id) {
        partService.deletePart(id);
    }

}




    
	
