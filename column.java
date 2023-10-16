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
        // Logic to add a new column to the Scrum board
        // Return true if successful, false otherwise
        return false;
    }

    public boolean removeColumn(column column) {
        // Logic to remove a column from the Scrum board
        // Return true if successful, false otherwise
        return false;
    }

    public Task createTask(String name, String description, User creator, Date dueDate, TaskPriority priority) {
        // Logic to create a new task and add it to the column
        Task newTask = new Task(name, description, creator, dueDate, priority);
        tasks.add(newTask);
        return newTask;
    }

    public boolean removeTask(Task task) {
        // Logic to remove a task from the column
        // Return true if successful, false otherwise
        return tasks.remove(task);
    }
}
