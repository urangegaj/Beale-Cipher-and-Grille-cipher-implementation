import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import beale_cipher.BealeCipherDecryption;
import beale_cipher.BealeCipherEncryption;
import grille_cipher.GrilleCipherDecryption;
import grille_cipher.GrilleCipherEncryption;


public class Main {
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner scanner = new Scanner(System.in);
      while (true){  
        System.out.println("Sheno cilin Cipher deshiron ta perdoresh:(Beale/Grille): ");
        String cipherSelection = scanner.nextLine();

        if(cipherSelection.equals("Beale") || cipherSelection.equals("beale")){
       
            System.out.println("Keni zgjedhur Beale Cipher.");
            System.out.print("Shkruani emrin e fajllit (psh. frankenstein.txt): ");
            String filename = scanner.nextLine().trim();

            File file = new File(filename);
        if (!file.exists()) {
        System.out.println("Fajlli nuk u gjet: " + filename);
        scanner.close();
        return;
        }
            System.out.print("Plaintext: ");
            String plaintext = scanner.nextLine().trim();

          String ciphertext = BealeCipherEncryption.encrypt(plaintext, filename);


             System.out.println("Ciphertext:" + ciphertext);

        System.out.print("A deshiron ta dekriptosh ciphertext (y/n): ");
        String response = scanner.nextLine().trim().toLowerCase();

        if (response.equals("Y") || response.equals("y")) {
            String decrypted = BealeCipherDecryption.decrypt(ciphertext, filename);
            System.out.println("Plaintext pas decryption: ");
            System.out.println(decrypted);
            
        }
        else{
            System.out.println("Dekriptimi eshte kaluar.");
        }
        scanner.close();
        break;
        }
        else if (cipherSelection.equals("Grille") || cipherSelection.equals("grille")){
            System.out.println("Keni zgjedhur Grille Cipher.");
           

            System.out.print("Plaintext: ");
            String plaintext = scanner.nextLine().trim();
    
            System.out.print("Key (shtyp Enter per te gjeneruar key): ");
            String key = scanner.nextLine().trim();
    
            if (key.isEmpty()) {
                System.out.print("Shtyp numrin per Mask Length: ");
                int n = scanner.nextInt();
                key = GrilleCipherEncryption.generateMask(n);
                System.out.println("Key i gjeneruar: " + key);
            }
    
            String value = GrilleCipherEncryption.GrilleEncryption(plaintext, key);
    
            System.out.println("Ciphertext: " + value);
            
            System.out.println("Plaintext i dekriptuar: ");
             String returnvalue = GrilleCipherDecryption.GrilleDecryption(value, key, plaintext.length());
            System.out.println(returnvalue);
    
            scanner.close();
            break;


        
        }
        else{
            System.out.println("Nuk keni zgjedhur njerin prej opsioneve, ju lutem provoni perseri.");
        }
        }
    }
    

}
