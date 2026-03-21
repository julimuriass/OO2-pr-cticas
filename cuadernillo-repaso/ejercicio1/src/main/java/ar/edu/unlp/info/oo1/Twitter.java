package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private ArrayList<User> users;

	public Twitter() {
		this.users = new ArrayList<>();
	}
	
	public boolean deleteUser(String name) {
		User user = this.users.stream().filter(u -> u.getScreenName().equals(name)).findAny().orElse(null);
		if (user == null) { return false;}

		this.users.remove(user);
		return true;
	}


	public boolean addUser(String screeName) {
		User user = this.users.stream().filter(u -> u.getScreenName().equals(screeName)).findAny().orElse(user = null);
		
		if (user != null) { return false;}
	
		User newUser = new User(screeName);
		this.users.add(newUser);
		return true;
	}

	public ArrayList<User> getUsers() { return this.users;}
}
