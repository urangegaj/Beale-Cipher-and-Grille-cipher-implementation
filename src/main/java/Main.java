import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== CIPHER TOOL ===");
    System.out.println("Choose an option:");
    System.out.println("1. Encrypt");
    System.out.println("2. Decrypt");

    int mode = Integer.parseInt(scanner.nextLine());

    System.out.println("Choose cipher:");
    System.out.println("1. Beale Cipher");
    System.out.println("2. Grille Cipher");
    int cipher = Integer.parseInt(scanner.nextLine());

    if (cipher == 1) {
        if (mode == 1) {
            // Encryption part for Beale Cipher
            System.out.print("Enter message to encrypt (letters only): ");
//                String message = scanner.nextLine();
//                System.out.print("Enter key text (reference text): ");
//                String keyText = scanner.nextLine();
//              String result = BealeCipher_Encryption.encrypt(message, keyText);
//                System.out.println("Encrypted (word positions): " + result);
        } else {
            // Decryption part for Beale Cipher
            System.out.print("Enter ciphertext (numbers separated by spaces): ");
            String ciphertext = scanner.nextLine();
            System.out.print("Enter key text: ");
            String keyText = scanner.nextLine();
            String result = BealeCipherDecryption.decrypt(ciphertext, keyText);
            System.out.println("Decrypted: " + result);
        }
    } else if (cipher == 2) {
        // Encryption and decryption for Grille Cipher (not included in this request)
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.print("Enter key: ");
        String key = scanner.nextLine();

//            if (mode == 1) {
//                String result = GrilleCipher_Encryption.encrypt(text, key);
//                System.out.println("Encrypted: " + result);
//            } else {
//                String result = GrilleCipher_Decryption.decrypt(text, key);
//                System.out.println("Decrypted: " + result);
//            }
//        } else {
//            System.out.println("Invalid option.");
//        }
//
//        scanner.close();
    }
}
}

