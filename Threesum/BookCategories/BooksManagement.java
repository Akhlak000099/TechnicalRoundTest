package BookCategories;


public class BooksManagement extends book{
	public static void main(String[] args) {
		book book1=new book();
		book1.createBook("Java", "100","AkhlakAnsari", 450, true);
		book book2=new book();
		book2.createBook("MS World","101","Suraj", 500, true);
		
		book book3=new book();
		book3.createBook("Social Book", "111", "Girjesh", 550, true);
		
		book book4=new book();
		book4.createBook("Loutry", "123", "Lalit", 450, true);
		
		book book5=new book();
		book5.createBook("Poem", "112", "Divya", 295,false);
		
		//display all books
		
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
		book4.displayBook();
		book5.displayBook();
		
		//dispaly books by name
		
		book2.displayBookByName("poem");
		book4.displayBookByName("Loutry");
		
		System.out.println("\n");
		
		//borrow books
		
		System.out.println("Borrow Book: ");
	    book1.borrowBook("Java");
	    book1.displayBook();
	}
}