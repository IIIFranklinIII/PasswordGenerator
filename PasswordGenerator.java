package randomgenerator;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {

        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "123456789";
        String symbols = "@#$%&.";

        String generatedText = lower + upper + numbers + symbols;
        int len = 6;
        char[] password = new char[len];
        Random random = new Random();

        for(int i = 0; i < len; i++) {
            password[i] = generatedText.charAt(random.nextInt(generatedText.length()));
        }

        System.out.println("Your new password is: " + new String(password));
    }
}
