package model;

public class Book {
	private String title;
	private String isbn;
	private Name name;
	private double price;

	public Book(String title, String isbn, Name name, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
	}

}
