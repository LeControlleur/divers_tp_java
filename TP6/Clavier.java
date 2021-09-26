package tp6;

/*
* Clavier.java
*
* Lycée Diderot
* Département Informatique Industrielle
* 61, rue David d'Angers
* 75019 Paris
*
* TP - Session 2006/07
* Copyright (c) 1996/2006, A. Lebret.
*/
import java.io.*;
import java.util.Scanner; // existe depuis la version 1.5.0 de Java
/**
* <p>Classe de lecture au clavier.<br />
* Les fonctions étant statiques, leur appel se fait comme suit :</p>
* <pre> String chaine = Clavier.S(); // pour récupérer une chaine
* byte octet = Clavier.b(); // pour récupérer un octet au clavier
* short eCourt = Clavier.s(); // pour récupérer un entier court au clavier
* int entier = Clavier.i(); // pour récupérer un entier au clavier
* long eLong = Clavier.l(); // pour récupérer un entier long au clavier
* float reelF = Clavier.f(); // pour récupérer un réel simple précision
* double reelD = Clavier.d(); // pour récupérer un réel double précision
* char car = Clavier.c(); // pour récupérer un caractère</pre>
* @version 1.0
* @since Java 1.5.0
* @see java.util.Scanner
* @author Alain Lebret
*/
public class Clavier {
	/** Lecture d'une chaîne de caractères au clavier */
	public static String S() { return ( new Scanner(System.in) ).nextLine(); }
	
	/** Lecture d'un octet au clavier */
	public static byte b() { return ( new Scanner(System.in) ).nextByte(); }
	
	/** Lecture d'un entier court (2 octets) au clavier */
	public static short s() { return ( new Scanner(System.in) ).nextShort(); }
	
	/** Lecture d'un entier (4 octets) au clavier */
	public static int i() { return ( new Scanner(System.in) ).nextInt(); }
	
	/** Lecture d'un entier long (8 octets) au clavier */
	public static long l() { return ( new Scanner(System.in) ).nextLong(); }
	
	/** Lecture d'un réel double précision au clavier */
	public static double d() { return ( new Scanner(System.in) ).nextDouble();}
	
	/** Lecture d'un réel simple précision au clavier */
	public static float f() { return ( new Scanner(System.in) ).nextFloat(); }
	
	/** Lecture d'un caractère unicode au clavier */
	public static char c() {
		return ( new Scanner(System.in) ).nextLine().charAt(0); 
	}
}
