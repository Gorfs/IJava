public class Calendar {
    /* EXERCICE 17 */
	// EXERCICE 17 QUESTION 1 
	public static int diffCounter (int start, int end) {
		// Modifier le code ci-dessous
		return -1;
	}

	// EXERCICE 17 QUESTION 2
	public static int weekdayOfCounter(int date) {
		// Modifier le code ci-dessous
		return -1;
	}
    
	/* EXERCICE 18 */
	// EXERCICE 18 QUESTION 1
	public static boolean isLeapYearJulian(int year) {
		// Modifier le code ci-dessous
		return true;
	}

	// EXERCICE 18 QUESTION 2
	public static int daysInYearJulian(int year) {
		// Modifier le code ci-dessous
		return -1;
	}

	/* EXERCICE 19 */
	public static int daysInMonth(int month, boolean inLeapYear) {
		// Modifier le code ci-dessous
		return -1;
	}

	/*EXERCICE 20*/
	// Declarez la fonction julianToCounter prenant en paramètre l'année, le mois, et le jour et renvoyant la date correspondante au format "compteur"

	/*EXERCICE 21*/
	// A completer
    

	public static void main (String[] args) {

		// ENLEVEZ LES COMMENTAIRES AU FUR ET A MESURE POUR TESTER VOS FONCTIONS
		System.out.println("====Ex17Q1====");
		testInt("diffCounter(582,584)", diffCounter(582,584), 2);

		System.out.println("====Ex17Q2====");
		testInt("weekdayOfCounter(1)", weekdayOfCounter(1), 1);
		testInt("weekdayOfCounter(7)", weekdayOfCounter(7), 0);
		testInt("weekdayOfCounter(11)", weekdayOfCounter(11), 4);

		// System.out.println("====Ex18Q1====");
		// testBoolean("isLeapYearJulian(1900)", isLeapYearJulian(1900), true);
		// testBoolean("isLeapYearJulian(1901)", isLeapYearJulian(1901), false);
		// testBoolean("isLeapYearJulian(2000)", isLeapYearJulian(2000), true);

		// System.out.println("====Ex18Q2====");
		// testInt("daysInYearJulian(1900)", daysInYearJulian(1900), 366);
		// testInt("daysInYearJulian(2000)", daysInYearJulian(2000), 366);

		// System.out.println("====Ex19====");
		// testInt("daysInMonth(1,false)", daysInMonth(1,false), 31);
		// testInt("daysInMonth(2,false)", daysInMonth(2,false), 28);
		// testInt("daysInMonth(2,true)", daysInMonth(2,true), 29);
		// testInt("daysInMonth(11,true)", daysInMonth(11,true), 30);
		
		// System.out.println("====Ex20====");
		// testInt("julianToCounter(1,1,1)", julianToCounter(1,1,1), -1);
		// testInt("julianToCounter(2,2,2)", julianToCounter(2,2,2), 396);
		// testInt("julianToCounter(101,1,1)", julianToCounter(101,1,1), 36524);
		// testInt("julianToCounter(2016,9,14)", julianToCounter(2016,9,14), 736234);
		
		// System.out.println("====Ex21====");
		// testInt("weekdayOfJulian(2016,9,14)", weekdayOfJulian(2016,9,14), 3);
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

	public static void testBoolean(String cmd, boolean exp, boolean val) {
		System.out.println(cmd + " == " + exp);
		if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
	}

}
