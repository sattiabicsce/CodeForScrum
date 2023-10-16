import java.util.ArrayList;
import java.util.UUID;

public class UserList {
    private ArrayList<User> users;

    private UserList() {
        users = new ArrayList<>();
    }

    private static UserList UserList(){
        return null;
    };

    public static UserList getInstance() {
        return null;
    }

    public boolean addUser(String username, String password, String firstName, String lastName, UUID id) {
        return true;
    }

    public boolean removeUser(String username) {
       return true;
    }

    public User getUser(String username) {
        return null;
    }
}
