public class Premiers {

    /* Écrivez vos fonctions ici */
    public static boolean isPrime(int n) {
        for (int i = 2; i < 20; i++) {
            if ((n % i == 0 || n == 0 || n == 1) && i != n ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(3));
        System.out.println(isPrime(6));
        System.out.println(isPrime(17));

    }
}
