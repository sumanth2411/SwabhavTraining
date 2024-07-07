package com.techlabs.LibraryManagement.solution.model;

public class ReturnBook implements IReturn{

	@Override
	public void returnBook(User user, Book book) {
		// TODO Auto-generated method stub
		 book.setBorrowed(false);
	     System.out.println(user.getName() + " has returned the book");
	}

}
