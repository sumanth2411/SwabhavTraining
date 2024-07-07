package com.techlabs.LibraryManagement.Violation.test;

import com.techlabs.LibraryManagement.Violation.model.Book;
import com.techlabs.LibraryManagement.Violation.model.User;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book book=new Book("Physics","HCverma");
			book.catalogBook();
			User user=new User(1,"sumanth");
			
			user.borrowBook(book,user);
			user.borrowBook(book,user);
			book.returnBook(user);
			user.borrowBook(book,user);

	}

}
