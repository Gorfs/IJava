public class Voyelles {

    /* Écrivez vos fonctions ici */
    public static int vowels(String n) {
        int counter = 0;
        String voweles = "aeouiAEOUI";
        for (int i = 0; i < n.length(); i++) {
            if (voweles.indexOf(n.charAt(i)) != -1) {
                counter += 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(vowels("Hello there my name is archie"));
        System.out.println(vowels("Hello World!"));

    }
}
