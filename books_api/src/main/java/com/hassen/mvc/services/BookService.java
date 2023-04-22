package com.hassen.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hassen.mvc.models.Book;
import com.hassen.mvc.repositories.BookRepo;

@Service
public class BookService {

	// adding the book repository as a dependency
    private final BookRepo bookRepository;
    
    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    /// ==== CRUD ======
    
 // READ ALL === Return all the books
    
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
  // CREATE A BOOK 
    
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
   // FIND BY ID
    
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
  /// UPDATE BOOK 
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setLanguage(lang);
            book.setNumberOfPages(numOfPages);
            return bookRepository.save(book);
        } else {
            return null;
        }
    }
    
   //// DELETE BOOK BY ID
    
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }


    
    
    
    
    
}
