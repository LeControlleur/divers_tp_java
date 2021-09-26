import java.util.Scanner;


public class PGCD {
	
		
	public static void main (String args[])  throws java.io.IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier :");
		int n1 = sc.nextInt();
		
		System.out.println("Veuillez saisir le deuxième entier :");
		int n2 = sc.nextInt();
        do {
          if(n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        } while (n1 != n2);
    System.out.printf("Le PGCD EST  = %d \n", n2);

}

}
