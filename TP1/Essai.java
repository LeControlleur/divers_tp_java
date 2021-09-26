/*
* Essai.java
*
* Lycée Diderot
* Département Informatique Industrielle
* 61, rue David d'Angers
* 75019 Paris
*
* TP - Session 2006/07
* Copyright (c) 1996/2006, A. Lebret
*/
/**
 *
 * Classe de Test
 *
 * @version 1.0
 *
 * @author Alain Lebret
 *
 */
public class Essai {
    /**
     * Essai de la classe AppliBouton
     * 
     * @param arguments tableau de chaînes de caractères
     * @return rien
     */
    public static void main(String[] arguments) {
        AppliBouton monCadre = new AppliBouton();
        monCadre.setTitle("TP java N°1");
        monCadre.setSize(200, 200);
        monCadre.setVisible(true);
    }
} // Fin Essai