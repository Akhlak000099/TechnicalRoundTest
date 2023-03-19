package BookCategories;

//write a program to create Book management system.
//create class name Book,and perform following actions:
//Attributes:
//bookid,bookName,bookPrice,authorName,library name(static),availability
//method:
//createBook() will store book details.(add atleast 5 books).
//displayBook()will display book details
//displayBookByName(): display specific book details based on bookName
//borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"

public class book {
	
		private static String bookName;
		private static String bookId;
		private static String bookAuthor;
		private static String bookLibraryName= "Anudip Library";
		private static float bookPrice;
		private static boolean availability;
		
		public void createBook(String bookName, String bookId, String bookAuthor,float bookPrice, boolean availabile ) {
			this.bookName=bookName;
			this.bookId=bookId;
			this.bookAuthor=bookAuthor;
			this.bookPrice=bookPrice;
			this.availability=availabile;
			
			
			
			
		}
		
		public static void displayBook() {
		
		        System.out.println("Book Name: " + bookName);
		  	    System.out.println("Book ID: " + bookId);
		        System.out.println("Book Price: " + bookPrice);
		        System.out.println("Author Name: " + bookAuthor);
		        System.out.println("Library Name: " + bookLibraryName);
		        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
		        System.out.print("\n");
			
		}
		
		  public static void displayBookByName(String name) {
		        if (bookName.equals(name)) {
		        	System.out.println("Book found having details: ");
		            displayBook();
		        } else {
		            System.out.println("Book not found!");
		        }
		    }

		    public static void borrowBook(String name) {
		        if (bookName.equals(name)) {
		            if (availability) {
		                availability = false;
		                System.out.println("Book borrowed successfully!");
		            } 
		            else {
		                System.out.println("Book not available for borrowing!");
		            }
		        }
		        else {
		            System.out.println("Book not found!");
		        }
		    }

	}

	   
		
		

	