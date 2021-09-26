import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.BreakIterator;

public class ExerciceWhile {

	public static void main (String args[])  throws java.io.IOException 
	{
		Scanner sc = new Scanner(System.in);
        int tmp=0;
        int tab[] = new int[10000];
        int counteur = 0;
        while(true) //remplir le tableau par les entiers saisis au clavier
            {
                    System.out.println("Veuillez saisir un nombre :");
                    Integer nbre = sc.nextInt ();
                    
                    if (nbre == 0) {
                        break;
                    } else {
                        tab[counteur] = nbre;
                        counteur++;
                    }
            }

        Integer min = 999999999;
        Integer max = 0;

        for(int j=0;j<counteur;j++)
        {
            min = Math.min(min, tab[j]);
            max = Math.max(max, tab[j]);
            
        }
        System.out.println("\n\nLe plus petit nombre est: "+min);

        System.out.println("\n\nLe plus grand nombre est: "+max);

        Integer som = 0;
        for(int i=0;i<counteur;i++) //afficher le nouveau tableau tri�
        {
        	som = som + tab[i];            
        }
        System.out.println("\n\nLa moyenne est: "+som/counteur);
        
}


}

