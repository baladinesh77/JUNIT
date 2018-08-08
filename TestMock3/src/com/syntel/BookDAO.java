package com.syntel;

import java.util.List;

public interface BookDAO {
	List<Book> findByAuthor(String name);
}
