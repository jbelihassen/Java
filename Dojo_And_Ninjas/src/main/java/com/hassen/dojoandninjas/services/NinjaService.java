package com.hassen.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassen.dojoandninjas.models.Ninja;
import com.hassen.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	
	// adding the book repository as a dependency
//  private final BookRepository bookRepository;
//  
//  public BookService(BookRepository bookRepository) {
//      this.bookRepository = bookRepository;
//  }
  
	// adding the book repo as a dependency using @Autowired
	@Autowired
	private NinjaRepository ninjaRepository;
	
	 // READ ALL
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // CREATE
    public Ninja createNinja(Ninja n) {
        return ninjaRepository.save(n);
    }
    // retrieves a Ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
//        if(optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
        return optionalNinja.isPresent() ? optionalNinja.get() : null ;
    	
    }
    
    // Update a Ninja
    public Ninja	updateNinja(Ninja n) {
    	return ninjaRepository.save(n);
    }
    
    // DELETE a Ninja
    public void deleteNinja(Long id) {
    	ninjaRepository.deleteById(id);
    }
	

}
