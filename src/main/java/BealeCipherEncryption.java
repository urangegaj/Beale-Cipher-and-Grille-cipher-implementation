
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BealeCipherEncryption {
    public static String encrypt(String plaintext, String keyFile) throws IOException {
        String keyText = Files.readString(Paths.get(keyFile), StandardCharsets.UTF_8);

        keyText = keyText.toUpperCase()
                         .replaceAll("[^A-Z\\s]", "")
                         .trim()
                         .replaceAll("\\s+", " ");

        String[] words = keyText.split(" ");
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = words[i].charAt(0);
            map.computeIfAbsent(c, k -> new ArrayList<>()).add(i + 1);
        }

        Map<Character, Integer> nextIndex = new HashMap<>();
        for (Character letter : map.keySet()) {
            nextIndex.put(letter, 0);
        }

        String norm = plaintext.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder sb = new StringBuilder();
        for (char c : norm.toCharArray()) {
            List<Integer> positions = map.get(c);
            if (positions == null) {
                throw new IllegalArgumentException(
                    "Character '" + c + "' not found in key text"
                );
            }
            int index = nextIndex.get(c);
            sb.append(positions.get(index)).append(",");
            index = (index + 1) % positions.size();
            nextIndex.put(c, index);
        }
        if (sb.length() > 0) sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String ciphertext = encrypt("ATTACK AT DAWN", "frankenstein.txt");
        System.out.println(ciphertext);
    }
}
