# Bealle-Cipher-and-Grille-cipher-implementation

# Udhezimet-e-hollesishme

Programi qe te ekzekutohet ka kerkese Java, si dhe duhet te sigurohet qe File qe perdoret per enkriptim tek Beale cipher, ne kete rast
e emerturar "frankenstein.txt". Ky file qe perdoret vetem duhet te sigurohet qe te jete ne te njejten direktorium per perdorim, pasiqe pas ekzekutimit
perdoruesit i kerkohet emri i File-it. Perdoruesi mund te perdore nje file tjeter qe eshte format libri ose dokument te njohur (key-text)

Programi behet run permes Main.java, ku perdoruesit pastaj i kerkohet input, duke i ndjekur pyetjet dhe japur vlera perdoruesi mund ta perdor programin thjeshte, jepet edhe pyetja per selektimin e cipher per perdorim.


# Pershkrimet-per-algorithmet-ne-program



















Funksioni tek GrilleCipeherDecryption --- GrilleDecryption

Funksioni GrilleDecryption eshte i tipit String, pra then nje plaintext si string,perdor tre parametera: ciphertext,key(ndryshe mask ose grille), dhe plaintextlength(nuk eshte i domosdoshem, mund te implementohet funksioni pa te)
fillimisht key dhe ciphertext konvertohen ne vargje karaktersh qe te perdoren ne iterim. Perdorim Stringbullder per te ndertuar shkronje per shkronje plaintext-in. Variablen keyIndex e perdorim per te mbajtur pozicionin brenda qelesit te ruajtur. Ne for loop iterohen karakteret e ciphertext-it dhee shtohen ne plaintext vetem ne poziat ku qelesi ka karakterin "_". Pasi qe qelesi mund te shete me i shkurter si plaintext, e perdorim operatorin e modulimit per te siguruar "rrotullimin" ose perseritjen e  qelesit nga fillimi, deri ne perfundimin e dekriptimit. 

# Shembuj-te-rezultateve

Merrni 2-3 shembull secili 