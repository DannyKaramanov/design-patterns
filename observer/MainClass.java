package observer;

public class MainClass {

	public static void main(String[] args) {
		
		BookStore bookStore = new BookStore();
		
		Observer ivan = new BookStoreSubscribers("Ivan");
		Observer eli = new BookStoreSubscribers("Eli");
		Observer bogdan = new BookStoreSubscribers("Bogdan");
		
		bookStore.subscribe(ivan);
		bookStore.subscribe(eli);
		bookStore.subscribe(bogdan);
		
		bookStore.setBook("We have received new books!");
		
		

	}

}
