package com.codingdojo.fullcrud.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="candys")
public class Candy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
    @Size(min = 3, max = 30)
	private String name;
	
	@NotNull
    @Size(min = 3, max = 15)
	private String brand;
	
	@NotNull
	@Max(10)
    @Min(0)
	private Integer rating;
	
	
	@NotNull
	@Max(10)
    @Min(1)
	private Integer price;
	
	
	// This will not allow the createdAt column to be updated after creation
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	
    
    
    
    
    
    
    public Candy() {}

    
    
    
	public Candy(@NotNull @Size(min = 3, max = 30) String name, @NotNull @Size(min = 3, max = 15) String brand,
			@NotNull @Max(10) @Min(0) Integer rating, @NotNull @Max(10) @Min(1) Integer price) {
		this.name = name;
		this.brand = brand;
		this.rating = rating;
		this.price = price;
	}




	public Candy(Long id, @NotNull @Size(min = 3, max = 30) String name, @NotNull @Size(min = 3, max = 15) String brand,
			@NotNull @Max(10) @Min(0) Integer rating, @NotNull @Max(10) @Min(1) Integer price, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.rating = rating;
		this.price = price;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	
	
	
	
	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public Integer getRating() {
		return rating;
	}




	public void setRating(Integer rating) {
		this.rating = rating;
	}




	public Integer getPrice() {
		return price;
	}




	public void setPrice(Integer price) {
		this.price = price;
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




	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
	
	
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    } 
}
