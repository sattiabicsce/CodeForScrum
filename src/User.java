import java.util.UUID;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private UUID id;

    public User(String username, String password, String firstName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(UUID id, String username, String password, String firstName, String lastName) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }
}