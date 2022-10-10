public class Museum {
	/* EXERCICE 15 */
	public static int reduction(int birthyear, int year) {
		// Modifier le code ci-dessous
        return year - birthyear < 18 ? 5 : year - birthyear >= 60 ? 3 : 0;
	}

	/* EXERCICE 16*/
	public static int price (int birthyear,int year,int price) {
		// Modifier le code ci-dessous
        return price - reduction(birthyear, year) > 0 ? price - reduction(birthyear, year) : 0 ;
	}
	
	/*************************************************************/
	/* PROGRAMME PRINCIPAL*/
	
	public static void main (String[] args) {
	
	
		System.out.println("====Exo 15====");
		testInt("reduction(2004,2021)", reduction(2004,2021), 5);
		testInt("reduction(1958,2021)", reduction(1958,2021), 3);
		testInt("reduction(2003,2021)", reduction(2003,2021), 0);
		testInt("reduction(1940,2000)", reduction(1940,2000), 3);
		testInt("reduction(1979,2000)", reduction(1979,2000), 0);
		
		System.out.println("====Exo 16====");
		testInt("price(2005,2021,25)",price(2005,2021,25),20);
		testInt("price(1958,2021,2)", price(1958,2021,2),0);
		testInt("price(1992,2021,10)",price(1992,2021,10),10);
		
	}
	
	/*************************************************************/
	/* NE PAS MODIFIER */
	/*************************************************************/
	public static void testInt(String cmd, int exp, int val) {
		System.out.println(cmd + " == " + exp);
		if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
	}
    /*************************************************************/ 

	
}
