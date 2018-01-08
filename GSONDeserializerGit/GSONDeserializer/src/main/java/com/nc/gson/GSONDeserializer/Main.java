package com.nc.gson.GSONDeserializer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		
		System.out.println("\n\t****GSON Deserializer Custom class****\n\n");
		 // Configure Gson
	    GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Book.class, new BookDeserializer());
	    Gson gson = gsonBuilder.create();

	    // The JSON data
	    try(Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/sample.json"), "UTF-8"))
	    {

	      // Parse JSON to Java
	      Book book = gson.fromJson(reader, Book.class);
	      System.out.println(book);
	    }
	}
}
