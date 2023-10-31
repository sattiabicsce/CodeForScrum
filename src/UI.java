import java.util.Scanner;
import java.util.UUID;

public class UI {

    private static User user;
    private static UUID loggedInUserId = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    signUp(scanner);
                    break;
                case 2:
                    logIn(scanner);
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void signUp(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // User Facade.signUp(username, password, firstName, lastName);
         System.out.println("User created successfully.");
    }

    private static void logIn(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : user.getUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUserId = user.getId();
                System.out.println("Login successful. Welcome, " + user.getFirstName() + "!");
                return;
            }
        }

        System.out.println("Invalid username or password. Please try again.");
    }
}