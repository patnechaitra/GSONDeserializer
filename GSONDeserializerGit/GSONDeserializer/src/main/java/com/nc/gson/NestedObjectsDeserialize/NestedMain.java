//working correctly
package com.nc.gson.NestedObjectsDeserialize;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NestedMain {

	 public static void main(final String[] args) throws IOException {
		    
		 // Configure GSON
		    final GsonBuilder gsonBuilder = new GsonBuilder();
		    gsonBuilder.registerTypeAdapter(Book2.class, new BookDeserialize2());
		    gsonBuilder.registerTypeAdapter(Author.class, new AuthorDeserializer());
		    final Gson gson = gsonBuilder.create();

		    // Read the JSON data
		    try (Reader reader = new InputStreamReader(NestedMain.class.getResourceAsStream("/NestedObjects.json"), "UTF-8")) {

		      // Parse JSON to Java
		      final Book2 book2 = gson.fromJson(reader, Book2.class);
		      System.out.println(book2);
		    }
		  }
	
}
