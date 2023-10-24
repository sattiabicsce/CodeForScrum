import java.util.ArrayList;
import java.util.UUID;

public class UserList {
    private ArrayList<User> users;
    private static UserList userList;

    private UserList() {
        users = new ArrayList<>();
    }

    public static UserList getInstance() {
        if (userList == null) {
            userList = new UserList();
            userList.addUser("user1", "password1", "John", "Doe");
            userList.addUser("user2", "password2", "Jane", "Smith");
        }
        return userList;
    }

    public boolean addUser(String username, String password, String firstName, String lastName) {
        UUID id = UUID.randomUUID();
        User newUser = new User(id, username, password, firstName, lastName);
        return users.add(newUser);
    }

    public boolean removeUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return users.remove(user);
            }
        }
        return false;
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
