package com.nc.gson.GSONDeserializer;

import java.util.Arrays;

public class Book {
	
	  private String[] authors;
	  private String isbn10;
	  private String isbn13;
	  private String title;
	
	  
	 public String getIsbn10() {
		return isbn10;
	}
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	public String getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthors(String[] authors2) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getAuthors() {
		return authors;
	}
	
	
	@Override
	public String toString() {
		return "Book {\n\ttitle=" + title  +",\n\t" + "isbn10= [ "+ isbn10 + " ],\n\tisbn13= [ " + isbn13 + " ],\n\t"
				+ "authors= " + Arrays.toString(authors) + " \n}";
	}
	
	
	
	
	

}
