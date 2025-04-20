package beale_cipher;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BealeCipherDecryption {
    public static String decrypt(String ciphertext, String keyFile) {
        try {
            String keyText = Files.readString(Paths.get(keyFile), StandardCharsets.UTF_8);


            keyText = keyText.toUpperCase()
                    .replaceAll("[^A-Z\\s]", "")
                    .trim()
                    .replaceAll("\\s+", " ");

            String[] numberStrings = ciphertext.trim().split(",");
            List<Integer> numbers = new ArrayList<>();
            for (String num : numberStrings) {
                try {
                    numbers.add(Integer.parseInt(num));
                } catch (NumberFormatException e) {
                    return "Invalid number: " + num;
                }
            }

            String[] words = keyText.split(" ");
            StringBuilder decrypted = new StringBuilder();

            for (int num : numbers) {
                if (num > 0 && num <= words.length) {
                    String word = words[num - 1];
                    decrypted.append(word.charAt(0));
                } else {
                    decrypted.append("?");
                }
            }

            return decrypted.toString();

        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();
        }
    }
}