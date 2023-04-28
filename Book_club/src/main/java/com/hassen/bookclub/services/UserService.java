package com.hassen.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.hassen.bookclub.models.LoginUser;
import com.hassen.bookclub.models.User;
import com.hassen.bookclub.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepo;
	
	
	/// REGISTER USER 
	
	// TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // check if a user exists ?
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	if(potentialUser.isPresent()) {
    		result.rejectValue("email", "registerationError", "This Email is already Taken!");
    	}
    	// Check if passwords matches
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("password", "registrationError", "Passwords must match !");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}else {
    		// hash the password
    		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    		// intercept the user object to store the hashed password instead of plain-text
    		newUser.setPassword(hashed);
    		// save user to the DB
    		return userRepo.save(newUser);
    	}
    }
    
    ///: LOGIN USER 
    
    
    
    public User login(LoginUser newLoginObject, BindingResult result) {
    	Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
    	if(!potentialUser.isPresent()) {
    		result.rejectValue("email", "loginError", "Invalid Login !");
    	}else {
    		User user = potentialUser.get();
    		// BCRYPT check password
    		if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
    			result.rejectValue("password","loginError", "Invalid Login !" );
    		}
    		if(result.hasErrors()) {
    			return null;
    		}else {
    			return user;
    		}
    		
    	}
        return null;
    }
    
    
   // READ ALL USER

    public List<User> allUsers(){
    	return userRepo.findAll();
    }
    
    // READ ONE USER BY ID
    
    public User findOne(Long id) {
    	
    	Optional<User> optionalUser = userRepo.findById(id);
    	return optionalUser.isPresent() ? optionalUser.get(): null;
    }
	
}
