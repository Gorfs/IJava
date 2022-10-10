public class Yoda {

    /* Écrivez vos fonctions ici */
    public static void yoda(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("May the force be with you. ");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        for (int i = 0; i < 100; i++) {
            System.out.println("May the force be with you.");
        }
        for (int j = 0; j < 42; j++) {
            int n = 100;
            for (int i = 0; i < n; i++) {
                System.out.println("May the force be with you. ");
            }
        }
        // c'est une boucle imbriquee car c'est une boucle completement dans une autre boucle
        // boucleception xd

    }
}
