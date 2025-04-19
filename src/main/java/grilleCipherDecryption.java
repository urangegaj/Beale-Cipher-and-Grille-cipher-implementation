


public  class grilleCipherDecryption{

    public static String GrilleDecryption(String ciphertext, String key, int plaintextLength) {
        char[] keyArray = key.toCharArray();
        char[] ciphertextArray = ciphertext.toCharArray();
        StringBuilder decodedplaintext = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < ciphertextArray.length && decodedplaintext.length() < plaintextLength; i++) {
            if (keyArray[keyIndex] == '_') {
                decodedplaintext.append(ciphertextArray[i]);
            }
            keyIndex = (keyIndex + 1) % keyArray.length;
        }

        return decodedplaintext.toString();
    }




}
        