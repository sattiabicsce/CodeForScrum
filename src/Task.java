import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Task {
    private String name;
    private String description;
    private ArrayList<User> users;
    private Date dueDate;
    private TaskStatus status;
    private TaskPriority priority;
    private List<Comment> comments;
    private List<History> history;

    public Task(String name, String description, ArrayList<User> users, Date dueDate, TaskStatus status, TaskPriority priority) {
        this.name = name;
        this.description = description;
        this.users = users;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
        this.comments = new ArrayList<>();
        this.history = new ArrayList<>();
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
}
