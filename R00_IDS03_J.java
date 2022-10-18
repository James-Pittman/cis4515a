public class R00_IDS03_J {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String username = "foo";
        boolean loginSuccessful = true;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}

if (loginSuccessful) {
    logger.severe("User login succeeded for: " + username);
} else {
    logger.severe("User login failed for: " + username);
}