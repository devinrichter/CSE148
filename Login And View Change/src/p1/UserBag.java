package p1;

public class UserBag { 
	private User[] arr;
	private int nElems;
		
	public UserBag(int maxSize) {
		arr = new User[maxSize];
	}
	
	
	public void insert(User user) {
		arr[nElems++] = user;
	}
	
	public User search(String id) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getId().equals(id)) {
				return arr[i];
			}
		}
		return null;
	}
	
	public boolean searchByUsernameAndPassword(String username, String password) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getUsername().equals(username) && arr[i].getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
