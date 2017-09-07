package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Testy {

	@Test
	public void test() {
		BookStore b = new BookStore();
		assertEquals(b.GenreCounter("a"),2);
	}

}
