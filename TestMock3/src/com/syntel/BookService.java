package com.syntel;

import java.util.*;

public interface BookService {
	List<Book> findBooksByAuthor(String author);
}
