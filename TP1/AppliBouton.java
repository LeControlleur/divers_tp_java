
/*
* AppliBouton.java
*
* Lycée Diderot
* Département Informatique Industrielle
* 61, rue David d'Angers
* 75019 Paris
*
* TP - Session 2006/07
* Copyright (c) 1996/2006, A. Lebret
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * <p>
 * Classe <b>héritant</b> de <code>JFrame</code>. Se compose d'une
 *
 * fenêtre avec deux boutons ainsi que d'une zone de texte.
 * </p>
 *
 *
 * @see javax.swing.JFrame
 *
 * @see javax.swing.JButton
 *
 * @see java.awt.FlowLayout
 *
 * @version 1.0
 *
 * @author Alain Lebret
 */
public class AppliBouton extends JFrame {
    /** Création d'un bouton de label OK */
    JButton boutonOK = new JButton("OK");
    /** Création d'un bouton de label Annuler */
    JButton boutonAnnuler = new JButton("Annuler");

    /** Constructeur par défaut */
    public AppliBouton() {
        // Objet de gestion des événements
        Delegue delegue = new Delegue(this);
        // Mise en place des composants avec un FlowLayout
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        this.getContentPane().add(boutonOK); // Ajout du bouton OK
        this.getContentPane().add(boutonAnnuler); // Ajout du bouton Annuler
        boutonOK.addActionListener(delegue); // Ajout des boutons dans la liste
        boutonAnnuler.addActionListener(delegue); // des composants gérés par
        // le délégué;
    }
} // Fin AppliBouton