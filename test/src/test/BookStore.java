package test;

import java.util.ArrayList;

public class BookStore {
	
 
 public int GenreCounter(String genreSearch){
	 int countGenre = 0;
	 ArrayList<Book> books = new ArrayList<Book>();
	 
	 
	 Book aBook = new Book("a","a",1,"a");
	 Book bBook = new Book("b","b",2,"a");
	 Book cBook = new Book("c","c",3,"c");
	 Book dBook = new Book("d","d",4,"c");
	 Book eBook = new Book("e","e",5,"c");
	 
	 
	 books.add(aBook);
	 books.add(bBook);
	 books.add(cBook);
	 books.add(dBook);
	 books.add(eBook);
	 
	
	 for(Book b : books){
		 if (b.getBook_genre() == genreSearch){
			 countGenre++;
		 }
	 }
	 
	 return countGenre;
 }
}
