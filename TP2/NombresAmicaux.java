public class NombresAmicaux {

    /* Écrivez vos fonctions ici */
    public static int sumDiv(int n) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                counter +=i;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(sumDiv(6));
        System.out.println(sumDiv(20));
        System.out.println(sumDiv(1184));

        System.out.println(sumDiv(1184) == 1210 && sumDiv(1210) == 1184);
        System.out.println(sumDiv(220) == 284 && sumDiv(284) == 220);

    }
}
