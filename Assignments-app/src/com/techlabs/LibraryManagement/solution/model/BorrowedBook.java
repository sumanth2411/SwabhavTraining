package com.techlabs.LibraryManagement.solution.model;

public class BorrowedBook implements IBook{

	@Override
	public void borrowBook(User user, Book book) {
		// TODO Auto-generated method stub
		  book.setBorrowed(true);
	      System.out.println(user.getName() + " has borrowed the book");
	}

	
}
