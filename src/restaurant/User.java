package restaurant;

public class User {
	public String name;
	public String phoneNumber;
	
	public User(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	

}
