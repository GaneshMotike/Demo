package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Images {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String imageName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "Images [id=" + id + ", imageName=" + imageName + "]";
	}

	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Images(int id, String imageName) {
		super();
		this.id = id;
		this.imageName = imageName;
	}
	
	

}