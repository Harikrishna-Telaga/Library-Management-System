
public class book {
	String title;
	String Author;
	boolean available;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public book(String title, String author) {

		this.title = title;
		this.Author = author;	
		this.available = true;
	}
}
