package singleton_mediator_patterns;

public class DogBot {

	private static DogBot instance;
	
	private DogBot() {
	}

	public static DogBot getInstance() {
		
		if(instance == null) {
			instance = new DogBot();
		}
		return instance;
	}
	
	public void CatDetector() {
		System.out.println("DogBot: The word 'cat' is forbiden");
		System.out.println("DogBot: I am removing you from the chatroom");
	}
}
