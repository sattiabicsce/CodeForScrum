import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

class Task {
    private String name;
    private String description;
    private ArrayList<User> users;
    private Date dueDate;
    private TaskStatus status;
    private TaskPriority priority;
    private List<Comment> comments;
    private List<History> history;
    private UUID id;

    public Task(String name, String description, ArrayList<User> users, Date dueDate, TaskStatus status, TaskPriority priority, UUID id) {
        this.name = name;
        this.description = description;
        this.users = users;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
        this.comments = new ArrayList<>();
        this.history = new ArrayList<>();
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<User> getUser() {
        return users;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<History> getHistory() {
        return history;
    }

    public UUID getId() {
        return id;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addHistory(History historyItem) {
        history.add(historyItem);
    }

    public void add(Task task) {
    }

    public void remove(Task t) {
    }

    public String toString() {
        return "\nTask ID: " + this.id +
               "\nTask Name: " + this.name +
               "\nTask Description: " + this.description +
               "\nDue Date: " + this.dueDate +
               "\nStatus: " + this.status +
               "\nPriority: " + this.priority +
               "\nAssigned Users: " + this.users +
               (comments != null && !comments.isEmpty() ? "\nComments: " + comments.toString() : "") +
               (history != null && !history.isEmpty() ? "\nHistory: " + history.toString() : "");
    }
    

}
