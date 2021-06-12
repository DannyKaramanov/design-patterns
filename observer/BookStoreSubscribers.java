package observer;

public class BookStoreSubscribers implements Observer {
	
	private String name;
	private Observable book;

	public BookStoreSubscribers(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.book == null) {
			System.out.println(this.getName() + " has no books");
			return;
		}
		
		String newBook = this.book.getNotified();
		System.out.println(this.getName() + " received an update from the Bookstore: " + newBook);

	}

	@Override
	public void setBook(Observable book) {
		this.book = book;

	}
	
	public String getName() {
		return name;
	}

}
