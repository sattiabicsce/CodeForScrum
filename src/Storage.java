import java.util.ArrayList;

public class Storage {

    public static ArrayList<User> getUsers() {
        return new ArrayList<>();
    }

    public static ArrayList<Project> getProjects() {
        return new ArrayList<>();
    }

    public static boolean saveUsers() {
        return true;
    }

    public static boolean saveProjects() {
        return true;
    }

    public static void main(String[] args) {
        ArrayList<User> users = getUsers();
        System.out.println("Retrieved Users: " + users);

        ArrayList<Project> projects = getProjects();
        System.out.println("Retrieved Projects: " + projects);

        boolean usersSaved = saveUsers();
        System.out.println("Users Saved: " + usersSaved);

        boolean projectsSaved = saveProjects();
        System.out.println("Projects Saved: " + projectsSaved);
    }
}
