public class Decompte {

    /* Écrivez vos fonctions ici */
    public static void rebours(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(x - i);
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        rebours(3);
        rebours(0);
        rebours(-3); // je suis pas sure si on est censer faire avec des nombres negatifs

    }
}
