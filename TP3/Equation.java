
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class Equation {
    public static void main(String args[]) throws java.io.IOException {
        double a, b, c, delta, x1, x2;

        System.out.println("résolution d'équations de second degré\n\n");
        System.out.println("Entrez les valeurs de a,b,c tel que ax\u00FD+bx+c=0\n\n");

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.println("a = ");
        str = sc.nextLine();
        a = new Double(str);

        System.out.println("\nb = ");
        str = sc.nextLine();
        b = new Double(str);

        System.out.println("\nc = ");
        str = sc.nextLine();
        c = new Double(str);

        delta = (b * b) - 4 * a * c;

        System.out.println("\n\nLe discriminant est : " + delta);

        if (delta < 0) {
            System.out.println("\n\nIl n'y a pas de racines reelle a l'equation.");
        } else {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("\n\nLes racines sont x1 = " + x1 + " et x2 = " + x2);
        }

    }

}