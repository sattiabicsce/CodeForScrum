import java.util.ArrayList;
import java.util.UUID;

public class Project {
    private String name;
    private UUID id;
    private ArrayList<Comment> comments;
    private User owner;
    private ArrayList<User> members;

    public Project(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.comments = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void addTask(Task task) {
        // Logic to add task to the project
    }

    public void removeTask(Task task) {
        // Logic to remove task from the project
    }

    public void share() {
        // Logic to share the project with members
    }

    public void addComment(String note) {
<<<<<<< HEAD
        Comment newComment = null;
=======
        Comment newComment = new Comment(owner, note);
>>>>>>> d6efc77744d3c564a181e41cab86717f8797d6d2
        this.comments.add(newComment);
    }
}