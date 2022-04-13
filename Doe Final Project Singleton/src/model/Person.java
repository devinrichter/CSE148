package model;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private String id;
	
	private static int idCount = 0;
	
	public Person(String name) {
		this.name = name;
		id = String.valueOf(idCount++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	

}
