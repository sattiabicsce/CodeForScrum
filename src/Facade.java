import java.util.List;

public class Facade {
    private User currentUser;
    private Project currentProject;
    private Storage storage;

    public Facade(Storage storage) {
        this.storage = storage;
    }

    public User login(String username, String password) {
        currentUser = storage.getUserByUsernameAndPassword(username, password);
        return currentUser;
    }

    public User signUp(String username, String password, String firstName, String lastName) {
        currentUser = new User(username, password, firstName, lastName);
        storage.saveUser(currentUser);
        return currentUser;
    }

    public Project createProject(String name) {
        currentProject = new Project(name);
        storage.saveProject(currentProject);
        return currentProject;
    }

    public boolean addTask(Task task) {
        if (currentProject != null) {
            currentProject.addTask(task);
            storage.updateProject(currentProject);
            return true;
        }
        return false;
    }

    public void addComment(String note) {
        if (currentProject != null) {
            Comment comment = new Comment(note);
            currentProject.addComment(comment);
            storage.updateProject(currentProject);
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