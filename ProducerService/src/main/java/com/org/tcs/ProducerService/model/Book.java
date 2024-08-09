package com.org.tcs.ProducerService.model;

public class Book {
public int bookId;
public String bookName;
public int bookCost;
public Book(int bookId, String bookName, int bookCost) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookCost = bookCost;
}
public Book() {
	super();
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookCost() {
	return bookCost;
}
public void setBookCost(int bookCost) {
	this.bookCost = bookCost;
}

}
