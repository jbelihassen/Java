package com.hassen.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassen.bookclub.models.Book;
import com.hassen.bookclub.repositories.BookRepository;





@Service
public class BookService {

	
	@Autowired
	private BookRepository bookRepository;
	
	 // READ ALL
	
	
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
	
    // CREATE
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    
    
  // retrieves a Book
    
    
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.isPresent() ? optionalBook.get() : null ;
    	
    }
    
    // Update a Book
    
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
	
    // DELETE a Book
    
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
    
    
    
}
