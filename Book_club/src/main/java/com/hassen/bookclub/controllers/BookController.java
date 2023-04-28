package com.hassen.bookclub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hassen.bookclub.models.Book;
import com.hassen.bookclub.models.User;
import com.hassen.bookclub.services.BookService;
import com.hassen.bookclub.services.UserService;


import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;




@Controller
public class BookController {
 
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	
	
	
  ////Get all Books ==== Diplay Route 
	
	@GetMapping("/books")
	public String index(Model model,  HttpSession s) {
		List <Book> allBooks = bookService.allBooks();
		
		/// the logged user 
		Long id = (Long) s.getAttribute("userID");
		User loggedinUser = userService.findOne(id);
		model.addAttribute("user", loggedinUser);
		model.addAttribute("allBooks",allBooks);
		return "allBooks.jsp";
	} 
	
	        /// Create Book /////
	
	   //// ==== DISPLAY ROUTE ====

		@GetMapping("/books/new")
		public String create(@ModelAttribute("book") Book b, Model model,HttpSession s) {
			
			
//			List<Book> allBooks = bookService.allBooks();
//			model.addAttribute("allBooks", allBooks);
			
			/// the logged user 
			Long id = (Long) s.getAttribute("userID");
    		User loggedinUser = userService.findOne(id);
    		model.addAttribute("user", loggedinUser);
			return "createBook.jsp";
		 }
		
		// ==== ACTION ROUTE ==== REDIRECT
		
		
			@PostMapping("/books/create")
		    public String create(@Valid @ModelAttribute("book") Book book,
		    					BindingResult result,
		    					Model model,
		    					RedirectAttributes flash) {
		        if (result.hasErrors()) {
       //	List<Dojo> allDojos = dojoService.allDojos();
       //	model.addAttribute("allDojos", allDojos);
		            return "createBook.jsp";
		        } else {
		        	
		            bookService.createBook(book);
		            flash.addFlashAttribute("success","Awesome ! You just created a Book 🎉");
		            return "redirect:/books";
		        }
		    }
			
	  ///// SHOW ONE BOOK 
			
			@GetMapping("/books/{id}")
			public String showOne(@PathVariable("id") Long id, Model model, HttpSession s) {
				
				
//			/// The logged user
				Long user_id = (Long) s.getAttribute("userID");
	    		User loggedinUser = userService.findOne(user_id);
	    		model.addAttribute("user", loggedinUser);
	    	/////////////////////////////////////	
				Book thisBook = bookService.findBook(id);
				model.addAttribute("book", thisBook);
				return "oneBook.jsp";
			}	
			
			
			
	// DELETE
			
			@DeleteMapping("/books/{id}")
			public String destroy(@PathVariable("id") Long id) {
				bookService.deleteBook(id);
				return "redirect:/books";
			}		
	
			
			
	// EDIT PAGE == DISPLAY ROUTE
			
			@GetMapping("/books/{id}/edit")
			public String update(@PathVariable("id") Long id, Model model) {
				Book book = bookService.findBook(id);
				model.addAttribute("book", book);
				return "editBook.jsp";
			}

			// === ACTION ROUTE ===
			@PutMapping("/books/{id}")
			public String updateDojo(@Valid @ModelAttribute("book") Book book, BindingResult result) {
				if (result.hasErrors()) {
					return "editBook.jsp";
				} else {
					bookService.updateBook(book);
					return "redirect:/books";
				}
			}		
			
			
			
			
			
			
}
