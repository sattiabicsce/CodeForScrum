import java.util.ArrayList;
import java.util.List;

public class column {
    private String name;
    private List<Task> tasks;

    public column(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public boolean addColumn(column column) {
        return false;
    }

    public boolean removeColumn(column column) {
        return false;
    }

    public Task createTask(String name, String description, User creator, Date dueDate, TaskPriority priority) {
        Task newTask = new Task(name, description, creator, dueDate, priority);
        tasks.add(newTask);
        return newTask;
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }
}
