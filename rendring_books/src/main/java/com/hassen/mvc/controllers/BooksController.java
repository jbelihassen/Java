package com.hassen.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hassen.mvc.models.Book;
import com.hassen.mvc.services.BookService;

@Controller
@RequestMapping("/books")
public class BooksController {
	

	/// Dependency Injection

    private final BookService bookService;
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }
    
    
  ///  All books
    
    @GetMapping("")
    public 	String index(Model model) {
     List<Book> books = bookService.allBooks();
     model.addAttribute("allBooks",books);
         return "allbooks.jsp";
    }
    
  /// Create Book
    
       // 1==Display Route 
    
   @GetMapping("/create")
     public String form () {
      return "createBook.jsp";
                }
    
      /// 2== Action Route 
           
    @PostMapping("/form")
    public String create(@RequestParam(value="title") String title,
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang, 
    		@RequestParam(value="pages") Integer numOfPages) {
         Book book = new Book(title, desc, lang, numOfPages);
         bookService.createBook(book);
         return  "redirect:/books";
    }
    
    
    
   ////  Get Book by ID
    
    @GetMapping("/{id}")
     public String show(@PathVariable("id") Long id,
    		             Model model  ) {
         Book book = bookService.findBook(id);
         model.addAttribute("theBook", book);
         return "showBook.jsp";
     }
    
    
    
  /// Update Book 
    
   /// 1==Display Route 
    
    @GetMapping("/update/{id}")
    public String update (@PathVariable("id") Long id, Model model ) {
     Book book = bookService.findBook(id);
     model.addAttribute("thebook", book);
       return "updateBook.jsp";
      }
    
   /// 2== Action Route
    
    
    @PostMapping("/{id}")
    public String update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
		return  "redirect:/books";
    }

   ////  Delete Book 
    
    @DeleteMapping("/books/{id}")
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
    
    
}
