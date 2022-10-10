public class LapinBlanc {

    /* Écrivez votre fonction ici */
    public static void deSecondes(int s) {
        int heures = s >= 3600 ? s / 3600 : 0;
        int minutes = (s - (heures * 3600)) >= 60 ? (s - (heures * 3600)) / 60 : 0;
        int secondes = s - (heures * 3600) - (minutes * 60);
        System.out.println(heures);
        System.out.println(minutes);
        System.out.println(secondes);
        System.out.println(" ");
    }

    public static void versSecondes(int h, int m, int s) {
        System.out.println(h * 3600 + m * 60 + s);
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        deSecondes(3600);
        deSecondes(432453640);
        deSecondes(0);
        deSecondes(120);

        versSecondes(3, 5, 34);
        versSecondes(0, 0, 0);
        versSecondes(24, 0, 0);
        versSecondes(48, 45, 24);

    }
}
