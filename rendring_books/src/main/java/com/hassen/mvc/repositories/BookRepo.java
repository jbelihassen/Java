package com.hassen.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hassen.mvc.models.Book;


@Repository
public interface BookRepo extends CrudRepository<Book, Long> {

	 // This method retrieves all the books from the database
	//Interface To communicate with the database
           List<Book> findAll();
     
    

	
	
}
