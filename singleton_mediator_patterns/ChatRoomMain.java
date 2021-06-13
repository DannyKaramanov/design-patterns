package singleton_mediator_patterns;

public class ChatRoomMain {

	public static void main(String[] args) {
		
		MessageMediator chat= new Chat();
		
		User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Bogdan");
		User user3 = new ChatUser(chat, "Eli");
		
		user3.send("Hey");
		user3.send("addBot");
		user2.send("Cat");
		user3.send("haha");
	}

}
