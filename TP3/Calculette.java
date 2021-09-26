
import java.util.Scanner;
public class Calculette {
	
	public static void main(String[] args){
		System.out.println("Entrer le premier nombre");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("Entrer le second nombre");
		double b = new Scanner(System.in).nextDouble();
		System.out.println("Entrer l'opérateur de calcul");
		Scanner op = new Scanner(System.in);
		double resultat;
		
	
		switch (op.nextLine()){
			case("+"):
				resultat = a+b;
				System.out.println(a + " + " + b + " = " + resultat);
				break;
			case("-"):
				resultat = a-b;
				System.out.println(a + " - " + b + " = " + resultat);
				break;
			case("/"):
				resultat = a/b;
				if(b==0){
					System.out.println("Division impossible");
					break;
				}else{
					System.out.println(a + " / " + b + " = " + resultat);
					break;
				}
				
			case("%"):
				resultat = a%b;
				System.out.println(a + " % " + b + " = " + resultat);
				break;
			case("*"):
				resultat = a*b;
				System.out.println(a + " * " + b + " = " + resultat);
				break;
			default :
				System.out.println("Opérateur de calcul non valide");
				break;
			}
		}
	}

