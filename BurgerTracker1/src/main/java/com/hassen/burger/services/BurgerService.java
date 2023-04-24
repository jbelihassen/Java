package com.hassen.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassen.burger.models.Burger;
import com.hassen.burger.repositories.BurgerRepository;

@Service
public class BurgerService {
 
	// adding the burger repository as a dependency
//  private final BurgerRepository burgerRepository;
//  
//  public BurgerService(BurgerRepository burgerRepository) {
//      this.burgerRepository = burgerRepository;
//  }
	
	// adding the burger repositories as a dependency using @Autowired
		@Autowired
		private BurgerRepository burgerRepository;
	
		// READ ALL
	    public List<Burger> allBurgers() {
	        return burgerRepository.findAll();
	    }
	    
	    
	 // CREATE
	    
	    
	    public Burger createBurger(Burger b) {
	        return burgerRepository.save(b);
	    }  
	    
	    
	    
	// retrieves a burger
	    
	    
	    
	    public Burger findBurger(Long id) {
	        Optional<Burger> optionalBurger = burgerRepository.findById(id);
         //	  if(optionalBook.isPresent()) {
         //	  return optionalBook.get();
         //	   } else {
         //  return null;
         //	 }
	        return optionalBurger.isPresent() ? optionalBurger.get() : null ;
	    	
	    }   
	    
	    
	    // Update a Book
	    public Burger	updateBook(Burger b) {
	    	return burgerRepository.save(b);
	    }
	    
	    
	    
	    // DELETE a Book
	    public void deleteBurger(Long id) {
	    	burgerRepository.deleteById(id);
	    }
	    
	        
	    
}
