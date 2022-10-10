public class Conditions {

    /* Écrivez vos fonctions ici */
    public static int absolute(int x) {
        return x > 0 ? x : -x;
    }

    public static String solve(int x, int y, int z) {
        if(x + y == z){
            return "x + y = z";
        } else if (x - y == z){
            return " x - y = z";
        }else{
            return "Rien du tout!";
        }
        
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        System.out.println(absolute(73));
        System.out.println(absolute(-37));
        // la fonction absolute donne la valeur absolue de l'entier entree en argument.
        System.out.println(solve(10, 5, 8));
        System.out.println(solve(5, 5, 10));
        System.out.println(solve(431, 425,243));
        System.out.println(solve(10, 5, 5));

    }
}
