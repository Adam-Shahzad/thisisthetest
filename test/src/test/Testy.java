package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Testy {

	@Test
	public void test() {
		BookStore b = new BookStore();
		
		ArrayList<GenreResult> expected = new ArrayList<GenreResult>();
		
		expected.add(new GenreResult("a",2));
		expected.add(new GenreResult("c",3));
		
		assertEquals(b.GenreCounter(),expected);
	}

}
