import java.util.ArrayList;
import java.util.List;

public class Facade {
    private User currentUser;
    private Project currentProject;

    public User login(String username, String password) {
        currentUser = Users.getInstance().getUser(username);
        return currentUser;
    }

    public User login(String password) {
        currentUser = Users.getInstance().getUser(password);
        return currentUser;
    }

    public User signUp(String username, String password, String firstName, String lastName) {
        currentUser = new User(username, password, firstName, lastName);
        Users.getInstance().getUser(username);
        return currentUser;
    }

    public Project createProject(String name) {
        currentProject = new Project(name);
        currentProject.saveProject(currentProject);
        return currentProject;
    }

    public boolean addTask(Task task) {
        if (currentProject != null) {
            currentProject.addTask(task);
            project.updateProject(currentProject);
            return true;
        }
        return false;
    }

    public void addComment(String note) {
        if (currentProject != null) {
            Comment comment = new Comment(note);
            currentProject.addComment(comment);
            project.updateProject(currentProject);
        }
    }

    public List<Task> getTasks() {
        if (currentProject != null) {
            return currentProject.getTasks();
        }
            return null;
    }
}

// has to interact with users, users will interact with the storage
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