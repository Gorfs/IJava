public class Moyenne {

    /* Écrivez vos fonctions ici */
    public static float moyenne (int a, int b, int c, int d, int e){
        int somme = a + b + c + d + e;
        float moyenne = somme / 5;
        System.out.println(somme);
        System.out.println(moyenne);
        return moyenne;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        moyenne(3, 5, 6, 2, 4);
        moyenne(3, 5, 6, 2, 5);

    }
}
