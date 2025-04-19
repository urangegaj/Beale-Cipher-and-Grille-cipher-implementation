import java.util.Scanner;

import grille_cipher.GrilleCipherDecryption;
import grille_cipher.GrilleCipherEncryption;

public class GrilleCipherMain {
   

    public static void main(String[] args){

      

        Scanner scanner = new Scanner(System.in);

        System.out.print("Plaintext: ");
        String plaintext = scanner.nextLine().trim();

        System.out.print("Key (shtyp Enter per te gjeneruar key): ");
        String key = scanner.nextLine().trim();

        if (key.isEmpty()) {
            key = GrilleCipherEncryption.generateMask();
            System.out.println("Key i gjeneruar: " + key);
        }

        String value = GrilleCipherEncryption.GrilleEncryption(plaintext, key);

        System.out.println("Ciphertext: " + value);
        scanner.close();

        System.out.println("Plaintext decrypted: ");
         String returnvalue = GrilleCipherDecryption.GrilleDecryption(value, key, plaintext.length());
        System.out.println(returnvalue);


    }
}

