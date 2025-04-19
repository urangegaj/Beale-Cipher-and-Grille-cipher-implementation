# Bealle-Cipher-and-Grille-cipher-implementation

# Udhezimet-e-hollesishme

Programi qe te ekzekutohet ka kerkese Java, si dhe duhet te sigurohet qe File qe perdoret per enkriptim tek Beale cipher, ne kete rast
e emerturar "frankenstein.txt". Ky file qe perdoret vetem duhet te sigurohet qe te jete ne te njejten direktorium per perdorim, pasiqe pas ekzekutimit
perdoruesit i kerkohet emri i File-it. Perdoruesi mund te perdore nje file tjeter qe eshte format libri ose dokument te njohur (key-text)

Programi behet run permes Main.java, ku perdoruesit pastaj i kerkohet input, duke i ndjekur pyetjet dhe japur vlera perdoruesi mund ta perdor programin thjeshte, jepet edhe pyetja per selektimin e cipher per perdorim.


# Pershkrimet-per-algorithmet-ne-program



















Funksioni tek GrilleCipeherDecryption --- GrilleDecryption

Eshte i tipit String, pra ne fund kthen plaintext ne forme String, si parametra merr ciphertext-in, key (ndryshe mask ose grille qe ne rastin tone jepet si string mirepo mund te implementohet me matrica dhe rrotullime te grille-it) dhe length te plaintext.
Fillimisht funksioni krijon nje varg ku ruhen pozitat e key-it. Key qe pranohet si string do te ndryshoj formen ne varg per perdorim.
Pastaj krijohet edhe nje varg per ciphertext-in ku perseri konvertojme stringun qe e marrim ne array per perdorim ne loop.
Per shkak se na nevojitet te dekodojme shkronje per shkronje, perdorim StringBuilder per ta marrur tekstin e dekoduar.
keyIndex perdoret per te ruajtur poziten mbrenda qelesit gjate iterimit neper ciphertext.
Perdoret nje for loop per te iteruar per do element te ciphertext-it, me parakusht qe te mos tejkalohet gjatesia e ciphertekstit qe te mos kemi infinite loop, si dhe kusht qe teksti i dekotuar te mos tejkaloj gjatesin e plaintextit, qe te mos printohen edhe shkronjat shtese qe perdoren ne enkriptim.
pastaj ne if statement merren vetem vlerat ku celesi ka "_" dhe ne ato pozita shtohen karakteret,kjo vazhdon ku qelesi rrotullohet neper renditje derisa te plotesohet teksti i dekoduar, rrotullimi sigurohet permes modulit me gjatesin e vete qelesit, qe e siguron qe qelesi te leviz 0->1->2->....-> keyarray.length-1 ->perserit 0->.....


# Shembuj-te-rezultateve

Merrni 2-3 shembull secili 