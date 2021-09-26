import java.util.StringTokenizer;

import java.io.*;
import java.util.Scanner; // existe depuis la version 1.5.0 de Java

public class Calculette extends java.lang.Object {
	
	private String operation;
	private double operande1;
	private double operande2;
	private char operateur;
	private double resultat;
	private boolean resultat_valide = true;
	
	public Calculette() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("BIENVENUE DANS LA CALCULETTE JAVA ");
		System.out.println("\n\n");
		
		String c;
		do {
			Calculette calc = new Calculette();
			calc.afficherMenu();
			calc.calculer();
			if(calc.resultat_valide) {
				calc.afficherCalcul();
			}
			System.out.println();
			System.out.println("Voulez-vous faire un nouveau calcul ? [oui/fin]");
			c = Clavier.S();
		} while (!c.equals("fin") && !c.equals("FIN"));
		
		System.out.println("Sortie du programme...");
		System.exit(0);
	}
	
	public void afficherCalcul() {
		System.out.println(this.operande1 + " " + this.operateur + " " + this.operande2 +" = " + this.resultat);
	}
	
	public void calculer() {
		switch(this.getOperateur()) {
			case  '+' :
				this.resultat = this.operande1 + this.operande2;
				break;
			case '-' :
				this.resultat = this.operande1 - this.operande2;
				break;
			case '*' :
				this.resultat = this.operande1 * this.operande2;
				break;
			case '/':
				if(this.operande2 == 0) {
					this.resultat_valide = false;
					System.out.println("L'operande 2 est egal a zero. Division par zero impossible.");
				}
				else 
					this.resultat = this.operande1 / this.operande2;
				break;
			default :
				System.out.println("Operateur invalide.");
				break;
		}
	}
	
	public char getOperateur() {
		return this.operateur;
	}
	
	public void setOperande1(double operande1) {
		this.operande1 = operande1;
	}
	
	public void setOperande2(double operande2) {
		this.operande2 = operande2;
	}
	
	public void afficherMenu() {
		System.out.println("Entrez l'operation - exemple : 34 + 78 , 'fin' pour quitter le programme :");
		this.operation = Clavier.S();
		if(this.operation.equals("fin") || this.operation.equals("FIN")) {
			System.out.println("Sortie du programme...");
			System.exit(0);
		} else {
			StringTokenizer st = new StringTokenizer(this.operation, " ");
			this.setOperande1(Double.parseDouble(st.nextToken()));
			this.operateur = st.nextToken().charAt(0);
			this.setOperande2(Double.parseDouble(st.nextToken()));
		}
	}

}


public class Clavier {
	/** Lecture d'une cha�ne de caract�res au clavier */
	public static String S() { return ( new Scanner(System.in) ).nextLine(); }
	
	/** Lecture d'un octet au clavier */
	public static byte b() { return ( new Scanner(System.in) ).nextByte(); }
	
	/** Lecture d'un entier court (2 octets) au clavier */
	public static short s() { return ( new Scanner(System.in) ).nextShort(); }
	
	/** Lecture d'un entier (4 octets) au clavier */
	public static int i() { return ( new Scanner(System.in) ).nextInt(); }
	
	/** Lecture d'un entier long (8 octets) au clavier */
	public static long l() { return ( new Scanner(System.in) ).nextLong(); }
	
	/** Lecture d'un r�el double pr�cision au clavier */
	public static double d() { return ( new Scanner(System.in) ).nextDouble();}
	
	/** Lecture d'un r�el simple pr�cision au clavier */
	public static float f() { return ( new Scanner(System.in) ).nextFloat(); }
	
	/** Lecture d'un caract�re unicode au clavier */
	public static char c() {
		return ( new Scanner(System.in) ).nextLine().charAt(0); 
	}
}
