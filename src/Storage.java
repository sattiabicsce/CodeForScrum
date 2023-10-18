import java.util.ArrayList;

public class Storage {
    private ArrayList<User> users;
    private ArrayList<Project> projects;

    public Storage() {
        this.users = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public boolean saveUsers() {
        return true; 
    }

    public boolean saveProjects() {
        return true;
    }
}
