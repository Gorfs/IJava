import java.lang.reflect.Array;

public class Cadre {

    /* Écrivez vos fonctions ici */
    public static String line(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + "#";
        }
        return result;

    }

    public static void frame(String ch) {
        System.out.print("+");
        //finding the longest phrase in the string
        String[] arr = ch.split("\n");
        int longest = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length() >= longest) {
                longest = arr[k].length();
            } 
        }
        for (int j = 0; j < longest + 2; j++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (int l = 0; l < arr.length; l++) {
            String spaces = "";
            int spaces_int = longest - arr[l].length();
            for (int m = 0; m < spaces_int +1; m++) {
                spaces += " ";
             }
            System.out.println("| " + arr[l] + spaces + "|");
        }  
        System.out.print("+");
        for (int k = 0; k < longest + 2; k++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("");
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        for (int i = 0; i < 10; i++) {
            System.out.println(line(i));
        }

        frame("Hello World!");
        frame("Hi");
        frame("My name is Archie!");
        frame("03/10/2022");
        frame("Hi there \nMy name is archie \nAnd I like frogs");


    }
}
