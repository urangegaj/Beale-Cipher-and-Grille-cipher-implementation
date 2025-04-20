# Bealle-Cipher-and-Grille-cipher-implementation

# Udhezimet-e-hollesishme

Programi qe te ekzekutohet ka kerkese Java, si dhe duhet te sigurohet qe File qe perdoret per enkriptim tek Beale cipher, ne kete rast
e emerturar "frankenstein.txt". Ky file qe perdoret vetem duhet te sigurohet qe te jete ne te njejten direktorium per perdorim, pasiqe pas ekzekutimit
perdoruesit i kerkohet emri i File-it. Perdoruesi mund te perdore nje file tjeter qe eshte format libri ose dokument te njohur (key-text)

Programi behet run permes Main.java, ku perdoruesit pastaj i kerkohet input, duke i ndjekur pyetjet dhe japur vlera perdoruesi mund ta perdor programin thjeshte, jepet edhe pyetja per selektimin e cipher per perdorim.



# Pershkrimet-per-algorithmet-ne-program


---

### Grille cipher
Grille cipher është një cipher transpozimi që përdor një maskë për të përcaktuar se ku do të vendosen shkronjat nga teksti origjinal, ndërsa pozicionet e tjera mbushen me shkronja të rastësishme.

---


### Procesi i Enkriptimit

Metoda `GrilleEncryption(String text, String mask)` kryen enkriptimin sipas këtyre hapave:



**Verifikimi i të dhënave hyrëse:**

Metoda `validateInputFormat(char[] maskArray, char[] textArray)` kryen verifikimin e formatit të të dhënave hyrëse duke u bazuar në kushtet e mëposhtme:


- Maska duhet të përmbajë vetëm karakteret '_' ose 'X'
- Maska duhet të përmbajë të paktën një '_' dhe një 'X'
- Teksti hyrës duhet të jetë të paktën 2 shkronja i gjatë (pasi hiqen karakteret jo-alfabetikë)

**Përgatitja e Tekstit:**

- Teksti konvertohet në shkronja të mëdha
- Hiqen të gjithë karakteret jo-alfabetikë

**Enkriptimi:**

- Maskës i përpunohet çdo karakter një nga një:
    - Kur haset '_': merret shkronja tjetër nga teksti origjinal
    - Kur haset 'X': vendoset një shkronjë e rastësishme e madhe
- Procesi vazhdon derisa të vendosen të gjitha shkronjat nga teksti origjinal
- Mbahen numërimet për të siguruar që të gjitha shkronjat janë përfshirë

**Rezultati:**

- Kthen tekstin e enkriptuar si një varg shkronjash të mëdha

---

### Gjenerimi i Maskës

Metoda `generateMask(int n)` krijon një maskë të rastësishme me n karaktere, e cila përmban si '_' ashtu edhe 'X'.  
Maska përmban gjithmonë të paktën një karakter të secilit lloj.

---

**Përdorimi**

### Enkriptimi
```java
String encryptedText = GrilleCipherEncryption.GrilleEncryption("plaintext", "X_X__XX_X_");
```

### Gjenerimi i Maskës
```java
String randomMask = GrilleCipherEncryption.generateMask(10);
```

---

**Trajtimi i Gabimeve**

Metoda kthen mesazhe gabimi në rastet e mëposhtme:

- Nëse maska përmban karaktere të pavlefshme (të ndryshme nga '_' ose 'X')
- Nëse maska përmban vetëm një lloj karakteri (të gjitha '_' ose të gjitha 'X')
- Nëse teksti hyrës është shumë i shkurtër (më pak se 2 shkronja pas përpunimit)

---


**Varësitë funksionale**

- Java Collections Framework
- Klasa `Random` nga Java për të gjeneruar shkronja dhe maska të rastësishme

---

















Funksioni tek GrilleCipeherDecryption --- GrilleDecryption

Funksioni GrilleDecryption eshte i tipit String, pra then nje plaintext si string,perdor tre parametera: ciphertext,key(ndryshe mask ose grille), dhe plaintextlength(nuk eshte i domosdoshem, mund te implementohet funksioni pa te)
fillimisht key dhe ciphertext konvertohen ne vargje karaktersh qe te perdoren ne iterim. Perdorim Stringbullder per te ndertuar shkronje per shkronje plaintext-in. Variablen keyIndex e perdorim per te mbajtur pozicionin brenda qelesit te ruajtur. Ne for loop iterohen karakteret e ciphertext-it dhee shtohen ne plaintext vetem ne poziat ku qelesi ka karakterin "_". Pasi qe qelesi mund te shete me i shkurter si plaintext, e perdorim operatorin e modulimit per te siguruar "rrotullimin" ose perseritjen e  qelesit nga fillimi, deri ne perfundimin e dekriptimit. 

# Shembuj-te-rezultateve

**Shembull**

**Input:**
```java
GrilleEncryption("Pershendetje", "XX_____X_X");
```

**Output i mundshëm:**
```
QKPERSHTEJFGNDETJZE
```
(Ku 'P', 'E', 'R', 'S', 'H', 'E', 'N', 'D', 'E', 'T', 'J', 'E' vendosen në pozicionet '_' dhe shkronjat e tjera janë të rastësishme)

---
