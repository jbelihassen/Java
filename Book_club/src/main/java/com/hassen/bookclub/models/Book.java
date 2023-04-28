package com.hassen.bookclub.models;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max= 100, message="Title Name must be at between 3 and 100 characters !")
	private String title;
	
	@NotNull
	@Size(min=3, max= 100, message="Author Name must be at between 3 and 100 characters !")
	private String author;
	
	
	@NotNull
	@Size(min=5, max= 100, message="Thoughts Name must be at between 5 and 100 characters !")
	private String thoughts;
	
  // Many to One	
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
    private User user;
	
   // CONSTRUCTOR
    
	    public Book() {}
    
	    @Column(updatable=false)
	 	@DateTimeFormat(pattern="yyyy-MM-dd")
	 	private Date createdAt;
	 	@DateTimeFormat(pattern="yyyy-MM-dd")
	 	private Date updatedAt;
	 	
	 // other getters and setters removed for brevity
	 	
		    
		    @PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		    @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		        
		        
		        
		   /// Getter and setter
		        
		        
		        
		    }
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getAuthor() {
				return author;
			}
			public void setAuthor(String author) {
				this.author = author;
			}
			public String getThoughts() {
				return thoughts;
			}
			public void setThoughts(String thoughts) {
				this.thoughts = thoughts;
			}
			public User getUser() {
				return user;
			}
			public void setUser(User user) {
				this.user = user;
			}
			public Date getCreatedAt() {
				return createdAt;
			}
			public void setCreatedAt(Date createdAt) {
				this.createdAt = createdAt;
			}
			public Date getUpdatedAt() {
				return updatedAt;
			}
			public void setUpdatedAt(Date updatedAt) {
				this.updatedAt = updatedAt;
			}
		    
		    
		    
    
}
