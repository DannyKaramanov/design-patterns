package singleton_mediator_patterns;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {
	
	private List<User> users;
	private DogBot dogBot;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
	@Override
	public void removeUser(User user) {
		this.users.remove(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User chatUser: this.users) {
			if(user != chatUser && message != "addBot" && message != "Cat") {
				chatUser.receive(message);
			}
		}
		
		if(message == "addBot"){
			this.dogBot = DogBot.getInstance();
			System.out.println(user.name + " has added the DogBot");
		}
		
		if (this.dogBot != null && message == "Cat") {
			dogBot.CatDetector();
			System.out.println("Dogbot removed " + user.name);
			this.removeUser(user);
		}
	}
}
