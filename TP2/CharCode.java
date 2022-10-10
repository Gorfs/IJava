public class CharCode {

    public static int charToCode(char c) {
        return (int) c;
    }

    public static char codeToChar(int code) {
        return (char) code;
    }

    /* Écrivez vos fonctions ici */
    public static void minuscule(char ch) {
        int code = charToCode(ch);
        System.out.print(code);
        if (code < 123 && code > 96) {
            System.out.println("Minuscule");
        } else if (code > 64 && code < 91) {
            System.out.println("Majuscule");
        } else {
            System.out.println("Caractere speciale");
        }
    }
    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        minuscule('r');
        minuscule('G');
        minuscule('8');
        minuscule('a');
        minuscule('Z');

    }
}
