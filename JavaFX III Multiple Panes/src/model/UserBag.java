package model;

public class UserBag implements Bagable {
	private User[] arr;
	private int nElems;

	public UserBag(int maxSize) {
		arr = new User[maxSize];
	}

	public boolean isSignedIn(String username, String password) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getUserName().equalsIgnoreCase(username) && arr[i].getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void display() {

	}
	
	public void insert(User user) {
		
	}
	
	public User searchByUserName(String username) {
		return null;
	}
	
	public User removeByUserName(String username) {
		return null;
	}

}
