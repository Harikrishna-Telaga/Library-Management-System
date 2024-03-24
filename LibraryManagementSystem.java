import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library library = new Library();

		// Adding some initial Books to library
		library.addBook("1. Java", " John Doe");
		library.addBook("2. Python", " San Martin");
		library.addBook("3. C++", " Martin Guptil");
		library.addBook("4. AWS", " Joe Bidden");
		library.addBook("5. SQL", " Vladmir Putin");
		

		boolean running = true;

		while (running) {
			System.out.println("\nLibrary Management System Menu:");
			System.out.println("1. Display Available Books");
			System.out.println("2. Borrow a Book");
			System.out.println("3. Return a Book");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-----------------------------------");
				library.displayAvailableBooks();
				System.out.println("-----------------------------------");
				break;
			case 2:
				System.out.print("Enter the title of the book you want to borrow: ");
				String bookTitle=sc.next();
				book borrowedBook=library.borrowBook(bookTitle);
				if(borrowedBook != null) {
					System.out.println("You have successsfully borrowed: " + bookTitle);
				}else {
					System.out.print("Sorry , book is not available.");
				}
				break;
			case 3:
				System.out.print("Enter the title of the book you want to Return: ");
				String ReturnBookTitle=sc.next();
				book ReturnBook=library.returnBook(ReturnBookTitle);
				if(ReturnBook != null) {
					System.out.println(ReturnBookTitle +" Book returned Successfully.");
				}else {
					System.out.println("Invalid Book title or Book alredy returned");
				}
				break;
			case 4:
				System.out.println("Exiting........");
				running = false;
				break;

			default:
				System.out.println("Invalid Choice Entered !!");
			}
		}
	}

}
