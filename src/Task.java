import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Task {
    private String name;
    private String description;
    private User creator;
    private Date dueDate;
    private TaskStatus status;
    private TaskPriority priority;
    private List<Comment> comments;
    private List<History> history;

    public Task(String name, String description, User creator, Date dueDate, TaskStatus status, TaskPriority priority) {
        this.name = name;
        this.description = description;
        this.creator = creator;
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

    public User getCreator() {
        return creator;
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
}
