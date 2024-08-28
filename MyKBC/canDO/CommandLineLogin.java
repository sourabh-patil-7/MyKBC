import java.util.Scanner;
import logo.KbcLogo; // Importing the KbcLogo class

public class CommandLineLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Clear the screen for better visibility
        clearScreen();

        // Creating an instance of KbcLogo and printing the logo
        KbcLogo kbcLogo = new KbcLogo();
        kbcLogo.printKbcLogo();

        System.out.println("\nWelcome to KBC LOGIN SYSTEM!");
        System.out.println("=============================\n");

        System.out.println("Enter your credentials to login:");

        System.out.print("\nUsername: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Simulating authentication
        boolean isAuthenticated = authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("\nLogin successful! Welcome, " + username + "!");
        } else {
            System.out.println("\nInvalid username or password. Please try again.");
        }
    }

    // Simulated authentication method
    private static boolean authenticate(String username, String password) {
        // Replace this with actual authentication logic
        return username.equals("admin") && password.equals("password");
    }

    // Function to clear the screen
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
