package p1;

public class User {
	private String username;
	private String password;
	private String id;

	private static int idCount = 0;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.id = String.valueOf(idCount++);
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
