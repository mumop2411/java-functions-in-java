import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the correct username and password
        String correctUsername = "your_username";
        String correctPassword = "your_password";

        // Initialize the number of login attempts
        int attempts = 3;

        // Display a welcome message
        System.out.println("Login Page...!");

        // Start the login loop
        while (attempts > 0) {
            // Prompt the user to enter their username
            System.out.println("Please Input your Username");
            String username = scanner.nextLine();

            // Prompt the user to enter their password
            System.out.println("Please enter password");
            String password = scanner.nextLine();

            // Check if the entered credentials are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                // Successful login
                System.out.println("Login was successful");
                break; // Exit the loop
            } else {
                // Incorrect login attempt
                System.out.println("Unsuccessful Login...Please try again");
                attempts--;

                // Check if there are remaining login attempts
                if (attempts > 0) {
                    System.out.println("You still have " + attempts + " chances left...");
                } else {
                    // No more login attempts left
                    System.out.println("You have no more attempts left...Your account has been locked");
                }
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

