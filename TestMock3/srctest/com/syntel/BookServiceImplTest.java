package com.syntel;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;

public class BookServiceImplTest {

	private BookServiceImpl service = new BookServiceImpl();
	
	@Test
	public void testFindBooksByAuthor() {
		List<Book> books = new LinkedList<>();
		books.add(new Book("Let Us C","Kanetkar"));
		books.add(new Book("Let Us C++","Kanetkar"));
		
		BookDAO dao = Mockito.mock(BookDAO.class);
		service.setDao(dao);
		
		Mockito.when(dao.findByAuthor("Kanetkar")).thenReturn(books);
		//Invoke method on service object
		//And, we are expecting 2 books 
		assertEquals(2, service.findBooksByAuthor("Kanetkar").size());
	}

}
