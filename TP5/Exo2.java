import java.util.Random;


public class Exo2 {
    // importing functions from previous exercise to help print out the arrays for debugging
    static Random rand = new Random () ;

    public static int randRange ( int a , int b ) {
        return(rand.nextInt(b-a)+a);
    }
    

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
            System.out.println("");
        }
    }

    public static void printArrayOfArrays(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("");
    }

    // start of actual exercise

    public static int[][] createGraph(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int friend = 1;
                if (k == i) {
                    friend = 0;
                }else if(k < i) {
                    if (result[k][i] == 1) {
                        friend = 1;
                    } else {
                        friend = 0;
                    }
                } else {
                    friend = randRange(0, 2);
                }
                result[i][k] = friend;
            }
        }
        return result;
    }
    
    public static int friends_nbr(int[][] R, int person) {
        System.out.println("debug");
        printArrayOfArrays(R);
        int friends = 0;
        for (int i = 0; i < (R.length - 1); i++) {
            if (R[person][i] == 1) {
                friends += 1;
            }
        }
        return friends;
    }

    public static int[] friends(int[][] R, int person) {
        int length = friends_nbr(R, person);
        if (length == 0) {
            int[] result = {}; 
            return result;
        }
        int[] result = new int[length];
        int found = 0;
        for (int i = 0; i < R.length - 1; i++) {
            if (R[person][i] == 1) {
                result[found ] = i + 1;
                found += 1;
            }
        }
        return result;
    }

    public static String popular(int[][] R, String[] noms) {
        int popular = 0;
        int popular_friends = 0;
        int temp = 0;
        for (int i = 0; i < R.length; i++) {
            temp = 0;
            for (int k = 0; k < R.length; k++) {
                if (R[i][k] == 1) {
                    temp += 1;
                }
            }
            if (temp > popular_friends) {
                popular_friends = temp;
                popular = i + 1;
            }
        }
        return noms[popular - 1];
    }

    public static int[] common_friends(int[][] R, int a, int b) {
        // cette fonction est horrible, j'aurai pus juste parcourir un tableau et la comparer avec la deuxieme, puis donner chaque fois que les deux tableaux etait a 1
        int[] friends1 = friends(R, a);
        int[] friends2 = friends(R, b);
        int counter = 0;
        for (int i = 0; i < friends1.length; i++) {
            for (int j = 0; j < friends2.length; j++) {
                if (friends1[i] == friends2[j]) {
                    counter += 1;
                }
            }
        }
        if (counter == 0) {
            int[] result = {};
            return result;
        }
        int[] result = new int[counter];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < friends2.length; j++) {
                if (friends1[i] == friends2[j]) {
                    result[i] = friends2[j];
                }
            }
        }
        return result;
    }
    
    public static int[][] addUser(int[][] R, int[] t) {
        int[][] result = new int[R.length + 1][R.length + 1];
        boolean added = false;
        for (int i = 0; i < R.length; i++) {
            int[] user = new int[R.length + 1];
            for (int j = 0; j < R.length; j++) {
                user[j] = R[i][j];
            }
            // checking wether to add the user to friends list
            for (int k = 0; k < t.length; k++) {
                if (i == t[k]) {
                    user[user.length - 1] = 1;
                    added = true;
                }
            }
            if (added == false) {
                user[user.length - 1] = 0;
            }
            result[i] = user;
        }
        int[] addedUser = new int[R.length + 1];
        for(int l = 0; l < R.length; l++){
            for(int m =0; m < t.length; m++){
                if (l == t[m]){
                    addedUser[l] = 1;
                }else{
                    addedUser[l] = 0;
                }
            }
        }
        result[R.length] = addedUser;
        return result;
    }

    // Exercise 5

    public static int[] aux_friends(int[][] R, int a) {
        // auxiliry function that just shows all the friends of a person a in R
        int[] result = new int[friends_nbr(R, a)];
        if (result.length == 0) {
            return result;
        }
        int place = 0; // used for appending the values to the list
        for (int i = 0; i < R.length -1 ; i++) {
            if (R[a][i] == 1) {
                result[place] = i ;
                place ++;
            }
        }
        return result;
    }
    

    public static int[][] invite(int[][] R, int a) {
        // takes a person, shows all his friends, then shows all the friends of friends
        int result[][] = new int[friends_nbr(R, a) + 1][];
        int index = 0;
        for (int i = 0; i < R.length; i++) {
            if (R[a][i] == 1) {
                result[index] = aux_friends(R, i);
                index++;
            }
        }
        result[index-1] = aux_friends(R, a); 
        return result;

        //
    }

    public static void main(String[] args){
        System.out.println("Grand 1");
        int[][] test1 = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 1 } };
        int[][] graph = createGraph(8);
        printArrayOfArrays(graph);
        System.out.println(" 2 friends number = " + friends_nbr(graph, 1));
        System.out.print(" the friends are,");
        printArr(friends(graph, 2));
        
        System.out.println("common friends between 1 and 2 are ");
        printArr(common_friends(graph, 1, 2));

        System.out.println("adding new user");
        int[] userFriends = {1,3,4};
        printArrayOfArrays(addUser(graph, userFriends));

        String[] noms = { "archie", "matheo", "Frank", "christope", "lucy", "telephone", "rat", "toto" };
        System.out.println("the most popular person is " + popular(graph, noms));
        
        printArrayOfArrays(invite( graph,4));

        
    }
}
