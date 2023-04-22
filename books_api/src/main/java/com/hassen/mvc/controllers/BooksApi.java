package com.hassen.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hassen.mvc.models.Book;
import com.hassen.mvc.services.BookService;

@RestController
@RequestMapping("/api/books")

public class BooksApi {
	
	/// Dependency Injection
	
	
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
  ///  All books
   @GetMapping("")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
  /// Create Book 
 
   @PostMapping("")
    public Book create(@RequestParam(value="title") String title,
    	               @RequestParam(value="description") String desc,
    		           @RequestParam(value="language") String lang,
    		           @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
  ////  Get Book by ID
    
   @GetMapping("/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
   
 /// Update Book 
   
   @PutMapping("/{id}")
   public Book update(
   		@PathVariable("id") Long id, 
   		@RequestParam(value="title") String title, 
   		@RequestParam(value="description") String desc, 
   		@RequestParam(value="language") String lang,
   		@RequestParam(value="pages") Integer numOfPages) {
       Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
       return book;
   }
   
  /// Delete Book 
   
   
   @DeleteMapping("/{id}")
   public void destroy(@PathVariable("id") Long id) {
       bookService.deleteBook(id);
   }
   
   
}
