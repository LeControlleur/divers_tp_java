import java.io.*;
import java.util.Scanner; // existe depuis la version 1.5.0 de Java
import java.util.StringTokenizer;





public class Essai {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("=========================== CALCULETTE JAVA TP 8 ========================");
		System.out.println("=====================================================================");
		System.out.println();
		
		String c;
		String c_1;
		do {
			System.out.println("Combien d'operations a effectuer ?");
			int n = Clavier.i();
			Calculette calc = new Calculette(n);
			for (int i = 0; i<n; i++) {
				System.out.println("Entrez une operation - ex : 1 + 4, 'fin' pour terminer : ");
				c_1 = Clavier.S();
				if (c_1.equals("fin") || c_1.equals("FIN")) {
//					System.out.println(calc);
//					System.out.println("Sortie du programme...");
//					System.exit(0);
					break;
				} else {
					calc.calculer(c_1);
				}
			}
			System.out.println(calc);
			System.out.println();
			System.out.println("Voulez-vous faire de nouveaux calculs ? [oui/fin]");
			c = Clavier.S();
		} while (!c.equals("fin") && !c.equals("FIN"));
		
		System.out.println("Sortie du programme...");
		System.exit(0);
	}

}



public class Calculette extends java.lang.Object {
	private OperationMathematique[] operations;
	protected int compteur;
	
	public Calculette(int uneTaille) {
		this.operations = new OperationMathematique[uneTaille];
	}
	
	public void calculer(String op) {
		OperationMathematique o = new OperationMathematique(op);
		o.resoudre();
		this.ajouterOperation(o);
		this.compteur++;
		System.out.println(o);
	}
	
	public void setOperations(OperationMathematique[] om) {
		this.operations = om;
	}
	
	public OperationMathematique[] getOperations() {
		return this.operations;
	}
	
	public void ajouterOperation(OperationMathematique op) {
		for(int d = 0; d<this.getOperations().length; d++) {
			OperationMathematique o = this.operations[d];
			if(o == null) {
				this.operations[d] = op;
				break;
			}
		}
	}
	
	public String toString() {
		String str = "Nombre d'operations : " + this.compteur + "\n";
		int c = 0;
		for(OperationMathematique o: this.getOperations()) {
			if(o != null) {
				str += ++c + ") " + o.getOperation() + " = " + o.getResultat() + "\n";
			}
		}
		return str;
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



public class Operation extends java.lang.Object {
	private String operation;
	
	public void Operation() {
		
	}
	
	public void Operation(String op) {
		this.setOperation(op);
	}
	
	public void setOperation(String op) {
		this.operation = op;
	}

	public String getOperation() {
		return this.operation;
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
	
	
	public String toString() {
		this.resoudre();
		String str = "Operande 1 : " + this.op "\n";
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
