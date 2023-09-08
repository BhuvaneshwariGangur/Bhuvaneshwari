package com.xworkz.day21.app.dto;

import java.io.Serializable;

public class NewsPaperDTO implements Serializable{
	private String name;
	private String publisher;
	private int pages;
	
	
	public NewsPaperDTO() {
		
	}


	public NewsPaperDTO(String name, String publisher, int pages) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.pages = pages;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	

}
