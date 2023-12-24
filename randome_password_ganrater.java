
import java.security.SecureRandom;

//CRETE PUBLIC CLASS 

public class randome_password_ganrater {

    public static void main(String[] args) {
        int passwordLength = 12; // You can change the password length as needed
        String generatedPassword = generatePassword(passwordLength);

        System.out.println("Generated Password: " + generatedPassword);
    }
// password contains VARCHAR or contains special symbol

    private static String generatePassword(int length) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

        String allCharacters = uppercaseLetters + lowercaseLetters + digits + specialCharacters;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}
