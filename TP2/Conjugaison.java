public class Conjugaison {

    /* Écrivez vos fonctions ici */
    public static void conjugate(String ch) {
        if (!ch.endsWith("er") || ch.toLowerCase() == "aller") {
            System.out.println("le verbe n'est pas du 1er group ");
        } else if (ch != ch.toLowerCase()) {
            System.out.println("le verbe n'est pas en minuscule");
        } else {
            String base = ch.substring(0, ch.length() - 2);
            System.out.println("Je " + base + "e");
            System.out.println("Tu " + base + "es");
            System.out.println("Il " + base + "e");
            if (base.charAt((base.length()-1)) == 'g') {
                System.out.println("Nous " + base + "eons");
            } else {
                System.out.println("Nous " + base + "ons");
            }
            
            System.out.println("Vous " + base + "ez");
            System.out.println("Ils " + base + "ent");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        conjugate("manger");
        conjugate("Abandonner");
        conjugate("aller");
        conjugate("finir");
        conjugate("virer");
        conjugate("deguster");


    }
}
