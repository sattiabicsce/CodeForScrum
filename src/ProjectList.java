import java.util.ArrayList;
import java.util.List;

public class ProjectList {
    
private ArrayList<Project> project;
private static ProjectList projectList;
    
    private ProjectList() {
    }

    public static ProjectList getInstance() {
        return projectList;
    }

    public boolean addProject(Project project) {
        return false;
    }

    // Method to remove a project from the list
    public boolean removeProject(Project project) {
        return false;
    }

    // Method to get a project from the list
    public Project getProject(String projectName) {
        return null;
    }
}
