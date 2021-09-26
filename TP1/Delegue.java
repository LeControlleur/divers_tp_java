
/*
* Delegue.java
*
* Lycée Diderot
* Département Informatique Industrielle
* 61, rue David d'Angers
* 75019 Paris
*
* TP - Session 2006/07
* Copyright (c) 1996/2006, A. Lebret.
*/
import java.awt.*;
import java.awt.event.*;

/**
 *
 * Classe implémentant l'interface ActionListener. Sert de Delegue
 *
 * à la classe AppliBouton pour la gestion des actions sur les boutons.
 *
 * Le délegué écoute les événements sur les objets dont il a la charge.
 *
 *
 * @see java.awt.event.ActionListener
 *
 * @see java.awt.Graphics
 *
 * @version 1.0
 *
 * @author Alain Lebret
 */
public class Delegue implements ActionListener {
    /** Instance de la classe AppliBouton */
    AppliBouton application;

    /**
     *
     * Constructeur par défaut.
     *
     * @param application Référence de l'objet uneApplication
     */
    public Delegue(AppliBouton uneApplication) {
        this.application = uneApplication;
    }

    /**
     *
     * Méthode d'ActionListener gérant les actions utilisateur
     *
     * @param e événements que le délégué doit prendre en compte.
     *
     *          Il est transmis par le système d'exploitation à l'interface
     *
     *          graphique de notre programme.
     *
     * @return rien
     */
    public void actionPerformed(ActionEvent e) {
        Graphics g = application.getGraphics();
        if (e.getSource() == application.boutonOK) {
            g.setColor(Color.red);
            g.drawString("Vive la TSIRIS1 !", 60, 100);
        } else if (e.getSource() == application.boutonAnnuler) {
            g.setColor(application.getBackground());
            g.drawString("Vive la TSIRIS1 !", 60, 100);
        }
    }
} // Fin Delegue