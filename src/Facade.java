public class Facade {
    private User currentUser;
    private Project currentProject;

    public User login(String username, String password) {
        return currentUser;
    }

    public User signUp(String username, String password, String firstName, String lastName, String occupation) {
        return currentUser;
    }

    public Project createProject(String name) {
        return currentProject;
    }

    public boolean addTask(Task task) {
        return false;
    }

    public void addComment(String note) {
    }
}
