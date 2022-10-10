import java.math.*;

public class AbsoluteValue {

    public static int myAbs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int newAbs(int x) {
        if (x < 10) {
            return (int) (Math.sqrt(x * x));
        } else if (x >= 10 && x < 100) {
            return (int) (Math.sqrt(x * x));
        } else if (x == 100) {
            return -100;
        } else {
            return (int) (Math.pow(Math.sqrt(Math.sqrt(x * x)), 2));
        }
    }

    public static void main(String[] args) {

        System.out.println("question 1.");
        System.out.println("");

        System.out.println("myAbs evaluer a 0 -> " + Integer.toString(myAbs(0)));

        System.out.println("question 2 :");

        System.out.println(" Entrée : " + "-10");
        System.out.println(" Sortie myAbs : " + myAbs(-10));
        System.out.println(" Entrée : " + "0");
        System.out.println(" Sortie myAbs : " + myAbs(0));
        System.out.println(" Entrée : " + 1);
        System.out.println(" Sortie myAbs : " + myAbs(1));

        System.out.println("");
        System.out.println("question 3.");
        System.out.println("");

        for (int i = -10; i <= 10; i++) {
            System.out.println("Entree : " + i);
            System.out.println(" Sortie myAbs : " + myAbs(i));
        }
        System.out.println("");
        System.out.println("question 4.");
        System.out.println("");

        for (int i = -10; i <= 0; i++) {
            System.out.println("Entree : " + i);
            int x = myAbs(i); 
            int trueValue = i > 0 ? i : i * -1;
            System.out.println(" Sortie myAbs : " + x + (x == trueValue ? "(valide)" : "(erreur)"));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Entree : " + i);
            int x = myAbs(i);
            int trueValue = i > 0 ? i : i * -1;
            System.out.println(" Sortie myAbs : " + x + (x == trueValue ? "(valide)" : "(erreur)"));
        }
        System.out.println("");
        System.out.println("question 5.");
        System.out.println("");

        for (int i = -100; i < 100; i++) {
            System.out.println("Entree : " + i);
            int x = myAbs(i);
            int trueValue = i > 0 ? i : i * -1;
            System.out.println(" Sortie myAbs : " + x + (x == trueValue ? "(valide)" : "(erreur)"));

        }
        
                
        System.out.println("");
        System.out.println("question 6.");
        System.out.println("");
        for (int i = -10; i <= 100; i++) {
            System.out.println("Entree : " + i);
            int x = newAbs(i);
            System.out.println(" Sortie newAbs : " + x + (x > 0 ? " ok" : " NE PASSE PAS"));
        }
        System.out.println("");
        System.out.println("question 7.");
        System.out.println("");

        for (int i = -200; i < 200; i++) {
            //System.out.println("Entree : " + i);
            int x = newAbs(i);
            int y = Math.abs(i);
            System.out.println(x == y ? "ok" : i + " ko");
            
        }

    }
}
