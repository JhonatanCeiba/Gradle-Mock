package org.gradle;

import org.junit.Test;
import org.junit.*;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class BookDALTest {

	 @Test
	 public void Testeo()
	 {
		 assertTrue(false);
	 }
	 
	 @Test
	 public void Testeo2()
	 {
		 assertTrue(true);
	 }
	 
	  private static BookDAL mockedBookDAL;
	  private static Book book1;
	  private static Book book2;

	  @BeforeClass
	  public static void setUp(){
	    //Create mock object of BookDAL
	    mockedBookDAL = mock(BookDAL.class);

	    //Create few instances of Book class.
	    book1 = new Book("8131721019","Compilers Principles",
	            Arrays.asList("D. Jeffrey Ulman","Ravi Sethi", "Alfred V. Aho", "Monica S. Lam"),
	            "Pearson Education Singapore Pte Ltd", 2008,1009,"BOOK_IMAGE");

	    book2 = new Book("9788183331630","Let Us C 13th Edition",
	            Arrays.asList("Yashavant Kanetkar"),"BPB PUBLICATIONS", 2012,675,"BOOK_IMAGE");

	    //Stubbing the methods of mocked BookDAL with mocked data. 
	    when(mockedBookDAL.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
	    when(mockedBookDAL.getBook("8131721019")).thenReturn(book1);
	    when(mockedBookDAL.addBook(book1)).thenReturn(book1.getIsbn());
	    when(mockedBookDAL.updateBook(book1)).thenReturn(book1.getIsbn());
	  }

	  public void testGetAllBooks() throws Exception {}

	  public void testGetBook() throws Exception {}

	  public void testAddBook() throws Exception {}

	  public void testUpdateBook() throws Exception {}
	}