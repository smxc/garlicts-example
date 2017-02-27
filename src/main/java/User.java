
public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setName("a");
		
		User user2 = new User();
		user1.setName("b");
		
		System.out.println(user1.getClass() == user2.getClass());
		System.out.println(user1.getClass().equals(user2.getClass()));
		
	}
	
}

