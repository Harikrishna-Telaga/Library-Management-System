import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	public void addBook(String title, String Author) {
		books.add(new book(title, Author));
	}

	public void displayAvailableBooks() {
		System.out.println("Available Books : ");
		for (book book : books) {
			System.out.println(book.getTitle() + " by " + book.getAuthor());

		}
	}

	public book borrowBook(String title) {
		for (book book : books) {
			if (book.getTitle().trim().equalsIgnoreCase(title) && book.isAvailable()) {
				book.setAvailable(false);
				return book;
			}

		}
		return null;

	}
	public book returnBook(String title) {
		for (book book : books) {
			if(book.getTitle().trim().equalsIgnoreCase(title)&& !book.isAvailable()) {
				book.setAvailable(true);
				return book;
			}
			
		}
		return null;
		
	}

}
