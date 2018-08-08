package com.syntel;

import java.util.List;

public class BookServiceImpl implements BookService {

	private BookDAO dao;
	
		
	@Override
	public List<Book> findBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthor(author);
	}


	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

}
