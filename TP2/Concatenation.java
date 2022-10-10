public class Concatenation {

    /* Écrivez vos fonctions ici */
    public static String concatNTimes (String ch, int n){
        String res = ch;
        for (int i = 0; i < n - 1; i++) {
            res += ch;
        }
        if (n <= 0) {
            return "";
        } else {
            return res;
        }
        
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(concatNTimes("hi", 4));
        System.out.println(concatNTimes("hi", -3));
        System.out.println(concatNTimes("hi", 0));

    }
}
