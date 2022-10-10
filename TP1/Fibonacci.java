public class Fibonacci {

    /* Écrivez vos fonctions ici */
    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.println(0);
        }else if (n < 3) {
            System.out.println(1);
        }else{
            int res = 1;
            int beforeLast = 1; 
            int temp = 0;
            for ( int i = 2; i < n; i ++){
                temp = res;
                res = res  + beforeLast;
                beforeLast = temp;
                //System.out.println(res);
            }
            System.out.println( res);
        }
        
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */

        // il y aura 144 lapins a la fin de l'annee
        
        for (int j = 0; j < 13; j++) {
            //System.out.println(j);
            fibonacci(j);
        }
    }
}
