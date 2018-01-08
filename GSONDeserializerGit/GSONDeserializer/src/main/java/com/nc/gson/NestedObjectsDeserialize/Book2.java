package com.nc.gson.NestedObjectsDeserialize;

import java.util.Arrays;

public class Book2 {

	  private String isbn;
	  private String title;
	  private Author[] authors;
	  
	
	
	public String getIsbn10() {
		return isbn;
	}
	public void setIsbn10(String isbn10) {
		this.isbn = isbn10;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	
	
	@Override
	public String toString() {
		return "Book {\n\ttitle=" + title  +",\n\t" + "isbn= [ "+ isbn + " ] ,"
				+ "\n\tauthors= " + Arrays.toString(authors) + " \n}";
	}

}
