import java.util.Random;




public class PierreFeuilleCiseaux{
    static Random rand = new Random () ;
    public static int randRange (int a , int b ) {
        return ( rand . nextInt (b - a ) + a ) ;
        }

    public static String tirage (){
        int choice = randRange(0,3);
        if (choice == 0){
            return "Pierre";
        }else if (choice == 1){
            return "Feuille";
        }else if (choice == 2){
            return "Lezard";
        } else if (choice == 3){
            return "spock";
        }else{
            return "Ciseaux";
        }
    }

    public static String coupJouer(){
        return System.console().readLine();
    }

    public static String coupOrdi(String hit){
        String res = "";
        switch(hit){
            case "Feuille" : res = "Ciseaux";
            break;
            case "Pierre" : res = "Feuille";
            break;
            case "Ciseaux" : res= "Pierre";
            break;
            case "Spock" : res = "Feuille";
            break;
            case "Lezard" : res = "Pierre";
            break;
        }
        return res;
    }

    public static String uneManche(){
        System.out.println("Hello there and welcome to ROCK PAPER SCISSORS !!!");
        System.out.println("Please enter your choice:");
        String playerChoice = coupJouer();
        String computerChoice = coupOrdi(playerChoice);
        //String computerChoice = tirage();
        String res = "";
        System.out.println("PC choice is " + computerChoice);
        switch (playerChoice){
            case "Pierre" : switch(computerChoice){
                case "Pierre" : res = "E";
                                break;
                case "Feuille" : res = "O";
                                break;
                case "Ciseaux" : res = "J";
                break;
                case "Lezard" : res = "J";
                break;
                case "Spock" : res = "O";
                break;
            }
            break;
            case "Feuille" : switch(computerChoice){
                case "Pierre" : res = "J";
                                break;
                case "Feuille" : res = "E";
                                break;
                case "Ciseaux" : res = "O";
                                break;
                case "Lezard" : res = "O";
                                break;
                case "Spock" : res = "J";
                        break;
            }
            break;
            case "Ciseaux" : switch(computerChoice){
                case "Pierre" : res = "O";
                                break;
                case "Feuille" : res = "J";
                                break;
                case "Ciseaux" : res = "E";
                                    break;
                case "Lezard" : res = "J";
                                break;
                case "Spock": res = "O";
                            break;
            }
            break;
            case "Lezard" : switch(computerChoice){
                case "Pierre" : res = "O";
                                break;
                case "Feuille" : res = "V";
                                break;
                case "Ciseaux" : res = "O";
                                break;
                case "Lezard" : res = "E";
                                break;
                case "Spock": res = "J";
                                break; 
            } 
            break;
            case "Spock" : switch(computerChoice){
                case "Pierre" : res = "J";
                                break;
                case "Feuille" : res = "O";
                                break;
                case "Ciseaux" : res = "J";
                                break;
                case "Lezard" : res = "O";
                                break;
                case "Spock": res = "E";
                                break; 
            }
            default: return "player has entered the wrong String!";
        }
        //System.out.println(res);
        return res;
    }

    public static void chifoumi(){
        System.out.println("please enter the minimum amount of victories to play to");
        int n = Integer.valueOf(System.console().readLine());
        int victories = 0;
        int losses = 0;
        int equalities = 0;
        String log = "";
        //for (int i = 0; i < n; i++){
        do{
            //System.out.println("il vous reste " + (n - i) + " manches!");
            String res =uneManche();
            switch (res){
                case "J": victories += 1;
                            log += "J";
                            break;
                case "O": losses += 1;
                          log += "O";
                            break;
                case "E" : equalities += 1;
                            log += "E";
                            break;
                default : losses += 1;
                            log += "O"; // si le joueur ne met pas la bonne entree il/elle est puni par une perte
                            break;
            }
        }while(victories < n && losses < n); 
        System.out.println("Tu a jouer " + (losses + victories + equalities) + " parties et dans ses parties vous avez gagnez " + victories + " fois, perdu " + losses + " fois et egaliter " + equalities + " fois!");
        System.out.println("voici le log des matches " + log);
        if (victories > losses){
            System.out.println("Vous etes le victeurs");
        }else if (victories < losses){
            System.out.println("L'ordinateur a gagnez");
        }else {
            System.out.println("Egalites, bonne chance la prochain fois!");
        }
    }


    public static void main(String[] args){
        System.out.println(tirage());
        System.out.println(tirage());
        System.out.println(tirage());
        System.out.println(tirage());
        //System.out.println(coupJouer());
        //System.out.println(coupJouer());
        //System.out.println(uneManche());
        chifoumi();

    }
}