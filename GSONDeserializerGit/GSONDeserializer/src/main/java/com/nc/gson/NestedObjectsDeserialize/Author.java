package com.nc.gson.NestedObjectsDeserialize;

public class Author {

	 private int Id;
	  private String name;
	  
	
	  
	  
	public int getId() {
		return Id;
	}

	public void setId(int i) {
		this.Id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "\n\t{\tid=" + Id + ",\tname=" + name + "}";
	}
	  
	  
}
