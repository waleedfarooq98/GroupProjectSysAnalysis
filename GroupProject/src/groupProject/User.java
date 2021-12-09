package groupProject;

public class User {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private boolean isActive;
	private String role;
	
	
	public User () {
		
	}
	
	public void validateLogin() {
		System.out.println("Login is validated");
		
	}
	
	public void resetPassword() {
		System.out.println("Resest Password Link Sent");
	}
	
	public void editUser() {
		System.out.println("User was edited");
	}
}

