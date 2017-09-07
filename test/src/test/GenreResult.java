package test;

public class GenreResult {
private String genre;
private int numberOfBooks;

public GenreResult(String genre, int numberOfBooks) {
	this.genre = genre;
	this.numberOfBooks = numberOfBooks;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public int getNumberOfBooks() {
	return numberOfBooks;
}

public void setNumberOfBooks(int numberOfBooks) {
	this.numberOfBooks = numberOfBooks;
}


}
