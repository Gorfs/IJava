public class Somme {

    public static int somme(int n){
    	int res=0;
        /* Compléter la fonction somme ici */
        for (int i = 0; i < n; i++) {
            res = res + i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
	    for(int i=0;i<50;i++){
		    testSomme(i);
	    }
    }

	/*************************************************************/
	/* NE PAS MODIFIER */
	/*************************************************************/
	public static void testSomme(int n) {
		System.out.println("Test sur la valeur " +n);
		if (somme(n) != n*(n+1)/2) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
		else{
			System.out.println("Le test est correct sur cette valeur.");
		}
	}

}
