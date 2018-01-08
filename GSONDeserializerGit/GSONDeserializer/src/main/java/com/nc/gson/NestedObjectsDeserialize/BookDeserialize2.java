package com.nc.gson.NestedObjectsDeserialize;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.nc.gson.GSONDeserializer.Book;

public class BookDeserialize2 implements JsonDeserializer<Book2> {

	@Override
	  public Book2 deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
	      throws JsonParseException {
	   final JsonObject jsonObject = json.getAsJsonObject();

	    final String title = jsonObject.get("title").getAsString();
	    final String isbn = jsonObject.get("isbn").getAsString();
	  //  final String isbn13 = jsonObject.get("isbn-13").getAsString();

	    // Delegate the deserialization to the context
	    Author[] authors = context.deserialize(jsonObject.get("authors"), Author[].class);

	    final Book2 book = new Book2();
	    book.setTitle(title);
	    book.setIsbn10(isbn);
	//    book.setIsbn13(isbn13);
	    book.setAuthors(authors);
	    return book;
	  }
}
