import java.util.ArrayList;
import java.util.UUID;

class Column {
    private String name;
    private ArrayList<Task> tasks;

    public Column(String name, ArrayList<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public void removeTask(UUID taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
            }
        }
    }

    public String toString() {
        String returnString = "\nColumn Name: " + this.name;
        for (Task task : tasks) {
            returnString += task.toString();
        }
        return returnString;
    }
}
