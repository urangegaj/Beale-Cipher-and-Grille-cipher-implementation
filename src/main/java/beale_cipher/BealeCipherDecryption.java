package beale_cipher;
import java.util.ArrayList;
import java.util.List;

public class BealeCipherDecryption {
    public static String decrypt(String ciphertext, String keyText) {
        String[] numberStrings = ciphertext.trim().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String num : numberStrings) {
            try {
                numbers.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                return "Invalid number: " + num;
            }
        }

        String[] words = keyText.split("\\s+");
        StringBuilder decrypted = new StringBuilder();

        for (int num : numbers) {
            if (num > 0 && num <= words.length) {
                String word = words[num - 1];
                if (!word.isEmpty()) {
                    decrypted.append(Character.toUpperCase(word.charAt(0)));
                } else {
                    decrypted.append("?");
                }
            } else {
                decrypted.append("?");
            }
        }

        return decrypted.toString();
    }
}

