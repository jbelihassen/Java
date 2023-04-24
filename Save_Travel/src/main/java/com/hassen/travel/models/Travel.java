package com.hassen.travel.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="travels")
public class Travel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max= 100, message="ExpenseName must be at between 3 and 100 characters!")
	private String expenseName;
	
	@NotNull
	@Size(min=3, max= 100,  message="Vendor must be at between 3 and 100 characters!" )
	private String vendor;
	
	@NotNull
	@Min(0)
	private Double amount;
	
	
	@NotNull
	@Size(min=3, max= 100, message="Description must be at between 3 and 100 characters!")               
	private String description;
	
	
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	
 // Constructor(s)
    
    
  	public Travel() {
  	}
  	
  	 
     public Travel (Long id, String expenseName, String vendor, Double amount, String description ) {
 	this.id = id;
 	this.expenseName = expenseName;
 	this.vendor = vendor;
 	this.amount = amount;
 	this.description = description;
     }
	
   /// other getters and setters removed for brevity
     
     
     @PrePersist
     protected void onCreate(){
         this.createdAt = new Date();
     }
     @PreUpdate
     protected void onUpdate(){
         this.updatedAt = new Date();
     }


     
     /// GETTER AND SETTERS
     
     
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getExpenseName() {
		return expenseName;
	}


	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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
