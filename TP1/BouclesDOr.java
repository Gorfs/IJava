public class BouclesDOr {

    /* Écrivez vos fonctions ici */
    public static void count_to(int n) {
        for (int i = 0; i < n + 1; i++) {
            System.out.println(i);
        }
    }
    
    public static void filter_even(int n) {
        if (n % 2 == 0){
            System.out.println("oui");
        }else{
            System.out.println("...");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        count_to(100);
        for (int j = 0; j <= 65535; j++) {
            filter_even(j);
        }


    }
}
