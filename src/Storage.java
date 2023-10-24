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

    public static void main(String[] args){
        ArrayList<User> users = getUsers();

        for(User user : users){
            System.out.println(user);
        }

        ArrayList<Project> projects = getProjects();
        for(Project project : projects){
            System.out.println(project);
        }
    }

}