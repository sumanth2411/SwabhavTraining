package com.techlabs.LibraryManagement.solution.model;

public class BorrowedUser {
	 private IBook borrowBook;
	 private IReturn returnBook;

	    public BorrowedUser(IBook borrowBook, IReturn returnBook) {
	        this.borrowBook = borrowBook;
	        this.returnBook = returnBook;
	    }

	    public void borrowBook(Book book, User user) {
	        if (book.isBorrowed()) {
	            System.out.println("Currently, the book is not available");
	            return;
	        }
	        borrowBook.borrowBook(user, book);
	    }

	    public void returnBook(Book book, User user) {
	        returnBook.returnBook(user, book);
	    }

}
