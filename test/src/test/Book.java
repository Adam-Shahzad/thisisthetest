package test;

public class Book {
	private int book_id;
	private String book_name;
	private String book_author;
	private String book_genre;

	public Book(String author, String name, int id, String genre) {
		this.book_author = author;
		this.book_id = id;
		this.book_name= name;
		this.book_genre = genre;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
}
