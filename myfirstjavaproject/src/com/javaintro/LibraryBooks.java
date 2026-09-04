package com.javaintro;

public class LibraryBooks {
	
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	
	static String libraryName;
	static String librarianName;
	
	void displayBookDetails() {
		
		System.out.println("Book Id :"  +  bookId);
		System.out.println("Book Title :"  +  bookTitle);
		System.out.println("Author Name :"  +  authorName);
		System.out.println("Available Copies :"  +  availableCopies);
		System.out.println();
	}
	
	void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(bookTitle + " issued successfully.");
        } else {
            System.out.println(bookTitle + " is not available.");
        }
    }
	
	static void displayLibraryDetails() {
		
		System.out.println("Library Name   : " + libraryName);
        System.out.println("Librarian Name : " + librarianName);
        System.out.println();
	}
	
	static void changeLibrarian(String newLibrarian) {
        librarianName = newLibrarian;
        
	}
	
	public static void main(String[] args) {
		
		LibraryBooks.libraryName = "Central Library";
        LibraryBooks.librarianName = "Jayachandra";
        
        LibraryBooks book1 = new LibraryBooks();
        book1.bookId = 1;
        book1.bookTitle = "Spiderman";
        book1.authorName = "Jyothish";
        book1.availableCopies = 5;
        
        LibraryBooks book2 = new LibraryBooks();
        book2.bookId = 2;
        book2.bookTitle = "Flashman";
        book2.authorName = "Jayanth";
        book2.availableCopies = 7;
        
        
        LibraryBooks.displayLibraryDetails();

        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("Book 2 Details:");
        book2.displayBookDetails();
        
        book1.issueBook();
        book2.issueBook();

	}

}
