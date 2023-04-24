package com.hassen.travel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hassen.travel.models.Travel;
import com.hassen.travel.repositories.TravelRepository;

@Service
public class TravelService {
	@Autowired
	private TravelRepository travelRepository;
	
	
	
	
	// READ ALL
    public List<Travel> allTravels() {
        return travelRepository.findAll();
    }
	
	
   // CREATE
    
    
    public Travel createTravel(Travel t) {
        return travelRepository.save(t);
    }  
    
    
      // retrieves a Travel
    
    public Travel findTravel(Long id) {
        Optional<Travel> optionalTravel = travelRepository.findById(id);
     
        return optionalTravel.isPresent() ? optionalTravel.get() : null ;
        
    }
    
    
        // Update a Travel
        
	    public Travel	updateTravel(Travel b) {
	    	return travelRepository.save(b);
	    }
    
	    // DELETE a Travel
	    
	    public void deleteTravel(Long id) {
	    	travelRepository.deleteById(id);
	    }
	
}
