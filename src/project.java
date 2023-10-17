import java.util.ArrayList;
import java.util.UUID;

public class project {
    private String name;
    private UUID id;
    private ArrayList<Comment> comments;
    private User owner;
    private ArrayList<User> members;

    public project(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.comments = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void addTask(Task task) {
    }

    public void removeTask(Task task) {
    }

    public void share() {
    }

    public void addComment(String note) {
        Comment newComment = new Comment(note);
        this.comments.add(newComment);
    }
}