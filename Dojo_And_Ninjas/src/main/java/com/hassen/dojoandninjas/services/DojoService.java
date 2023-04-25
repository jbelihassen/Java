package com.hassen.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassen.dojoandninjas.models.Dojo;
import com.hassen.dojoandninjas.repositories.DojoRepository;





@Service
public class DojoService {
	
	// adding the library repository as a dependency
    //  private final LibraryRepository libraryRepository;
    //  
     //  public LibraryService(LibraryRepository libraryRepository) {
     //      this.libraryRepository = libraryRepository;
     //  }
  
	// adding the library repositories as a dependency using @Autowired
	
	
	@Autowired
	private DojoRepository dojoRepository;
	   
	 // READ ALL
	
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    
    // CREATE
    
    
    public Dojo createDojo(Dojo d) {
        return dojoRepository.save(d);
    }
    
    
   // retrieves a Dojo
    
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);     
        return optionalDojo.isPresent() ? optionalDojo.get() : null ; 
    }
    
    
   // Update a Dojo
    public Dojo	updateDojo(Dojo d) {
    	return dojoRepository.save(d);
    }
    
    // DELETE a Dojo
    
    
    public void deleteDojo(Long id) {
    	dojoRepository.deleteById(id);
    } 
    
    

}
