
import java.util.StringTokenizer;


import java.io.*;
import java.util.Scanner; // existe depuis la version 1.5.0 de Java






public class Essai {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("=========================== CALCULETTE JAVA TP 7 ========================");
		System.out.println("=====================================================================");
		System.out.println();
		
		String c;
		do {
			System.out.println("Entrez une operation - ex : 1 + 4, 'fin' pour quitter : ");
			c = Clavier.S();
			if (c.equals("fin") || c.equals("FIN")) {
				System.out.println("Sortie du programme...");
				System.exit(0);
			}
			Calculette calc = new Calculette();
			calc.calculer(c);
			System.out.println(calc);
			System.out.println();
			System.out.println("Voulez-vous faire un nouveau calcul ? [oui/fin]");
			c = Clavier.S();
		} while (!c.equals("fin") && !c.equals("FIN"));
		
		System.out.println("Sortie du programme...");
		System.exit(0);
	}

}


public class Calculette extends java.lang.Object {
	private OperationMathematique operationM;
	
	public Calculette() {
		
	}
	
	public void calculer(String op) {
		this.setOperationM(new OperationMathematique(op));
		this.getOperationM().resoudre();
	}
	
	public void setOperationM(OperationMathematique om) {
		this.operationM = om;
	}
	
	public OperationMathematique getOperationM() {
		return this.operationM;
	}
	
	public String toString() {
		this.calculer(this.getOperationM().getOperation());
		return this.operationM.toString();
	}
}


public class OperationMathematique extends Operation {
	private double resultat;
	

	public OperationMathematique() {
		super();
	}
	
	public OperationMathematique(String op) {
		this.setOperation(op);
		StringTokenizer st = new StringTokenizer(this.getOperation(), " ");
		
		this.operande1 = Double.parseDouble(st.nextToken());
		this.operateur = st.nextToken().charAt(0);
		this.operande2 = Double.parseDouble(st.nextToken());
	}
	


	public void resoudre() {
		switch(this.getOperateur()) {
			case  '+' :
				this.setResultat(this.getOperande1() + this.getOperande2());
				break;
			case '-' :
				this.setResultat(this.getOperande1() - this.getOperande2());
				break;
			case '*' :
				this.setResultat(this.getOperande1() * this.getOperande2());
				break;
			case '/':
				if(this.getOperande2() == 0) {
					this.resultat_valide = false;
				}
				else 
					this.setResultat(this.getOperande1() / this.getOperande2());
				break;
			default :
				System.out.println("Operateur invalide.");
				break;
		}
	}
	
	
	public void setResultat(double r) {
		this.resultat = r;
	}
	
	public void setOperateur(char o) {
		this.operateur = o;
	}
	
	public double getOperande1() {
		return this.operande1;
	}
	
	public double getOperande2() {
		return this.operande2;
	}
	
	public char getOperateur() {
		return this.operateur;
	}
	
	public double getResultat() {
		return this.resultat;
	}
	
	public String toString() {
		this.resoudre();
		String str = "Operande 1 : " + this.getOperande1() + "\n";
		str += "Operande 2 : " + this.getOperande2() + "\n";
		str += "Operateur : " + this.getOperateur() + "\n";
		str += "Operation : " + this.getOperation() + "\n";
		if(this.resultat_valide) {
			str += "Resultat : " + this.getResultat() + "\n";
		} else {
			str += "Resultat : Division par zero impossible\n";
		}
		return str;
	}
}


public class Operation extends java.lang.Object {
	private String operation;
	
	public Operation() {
		
	}
	
	public Operation(String op) {
		this.setOperation(op);
	}
	
	public String getOperation() {
		return this.operation;
	}
	
	public void setOperation(String op) {
		this.operation = op;
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


