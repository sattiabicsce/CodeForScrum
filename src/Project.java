import java.util.ArrayList;
import java.util.UUID;

public class Project {
    private String projectName;
    private UUID id;
    private ArrayList<Comment> comments;
    private User owner;
    private ArrayList<User> members;

    public Project(String name) {
        this.projectName = name;
        this.id = UUID.randomUUID();
        this.comments = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }
    
    public void addTask(Task task) {
        if (task != null) {
            task.add(task);
            System.out.println("Task added to the project: " + task.getName());
        } else {
            System.out.println("Error: Task cannot be null.");
        }
    }

    public void removeTask(Task task) {
        if (task != null) {
            boolean found = false;
            for (Task t : task) {
                if (t.equals(task)) {
                    task.remove(t);
                    found = true;
                    System.out.println("Task removed from the project: " + task.getName());
                    break;
                }
            }
            if (!found) {
                System.out.println("Error: Task not found in the project.");
            }
        } else {
            System.out.println("Error: Task cannot be null.");
        }
    }
    public void share() {
        // Logic to share the project with members
    }

    public void addComment(String note) {
        Comment newComment = new Comment(owner, note);
        this.comments.add(newComment);
    }
}