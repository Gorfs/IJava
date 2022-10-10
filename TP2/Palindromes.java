public class Palindromes {

    /* Écrivez vos fonctions ici */
    public static String reverse(String ch) {
        String res = "";
        for (int i = 0; i < ch.length(); i++) {
            res += ch.charAt(ch.length() - i-1);
        }
        return res;
    }

    public static boolean palindrome(String ch) {
        if (ch.equals(reverse(ch))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean palindrome_bis(String ch) {
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) != ch.charAt(ch.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(reverse("racecar"));
        System.out.println(reverse("archie"));
        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("archie"));
        System.out.println(palindrome_bis("racecar"));
        System.out.println(palindrome_bis("archie"));

    }
}
