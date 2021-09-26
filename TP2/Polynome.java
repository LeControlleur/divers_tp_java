
public class Polynome {
    /**
     * Effectue le calcul polynomiale à partir de l'argument
     * 
     * @param x nombre
     * @return resultat du calcul
     * @see java.lang.Math
     */
    public double calculer(double x) {
        double u, y;
        u = (x - 1) / x;
        y = u + Math.pow(u, 2) / 2. + Math.pow(u, 3) / 3. + Math.pow(u, 4) / 4. + Math.pow(u, 5) / 5.;
        return y;
    }

    /**
     * Point d'entree de l'application
     * 
     * @param arguments tableau de chaines de caractères
     * @return rien
     */
    public static void main(String[] arguments) {
        Polynome p = new Polynome();
        System.out.println("x = " + arguments[0] + " et y = " + p.calculer(new Double(arguments[0]).doubleValue()));
    }
}
