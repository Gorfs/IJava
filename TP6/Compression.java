import java.util.Objects;

public class Compression {

    public static void printIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
            System.out.println("");
        }
        System.out.println("]");
    }

    public static void printStringArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
            System.out.println("");
        }
        System.out.println("]");
    }

    public static void printCharArr(char[] arr) {
        for (char aChar : arr) {
            System.out.print(" " );
            System.out.print(aChar);
            System.out.print(" ");
            System.out.println("");
        }
        System.out.println("]");
    }

    public static int maxLength(String[] dic){
        // returns the max_length of an item in the array
        int max_length = 0;
        for (String s : dic) {
            if (s.length() > max_length) {
                max_length = s.length();
            }
        }
        return max_length;
    }
    public static String[] listStringAppend (String[] arr, String str){
        // appends a string to a list of strings.
        String[] result = new String[arr.length + 1];
        for (int i =0; i < arr.length; i++){
            result[i] = arr[i];
        }
        result[arr.length] = str;
        return result;
    }
    public static int[] listIntAppend (int[] arr, int str){
        // appends a string to a list of strings.
        int[] result = new int[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, arr.length);
        result[arr.length] = str;
        return result;
    }

    public static char[] listCharAppend (char[] arr, char str){
        // appends a string to a list of strings.
        char[] result = new char[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, arr.length);
        result[arr.length] = str;
        return result;
    }
    public static int LZencode(String s, int[] t, char[] u){
        int counter = 0 ;
        String[] dic = {};

        // setting up the dictionary
        String str = "";
        boolean found = false;
        for(int i = 0; s.length() > i; i++){
            str += s.charAt(i);
            System.out.println("str = " + str);
            for (int j = 0; j < dic.length; j++){
                if (Objects.equals(str, dic[j])){
                    found = true;
                    break;
                }
            }
            if (found){
                // if the object was found in the list
                found = false;
            }else{
                // if the string was not in the list
                dic = listStringAppend(dic, str);
                str = "";
            }
        }

        // step 2
        String stri = "";
        for(int l = 0 ; l < dic.length; l++){
            if (dic[l].length() > 1) {
                stri = dic[l].substring(0,dic[l].length() - 1);
                for(int m = 0; m < dic.length; m++){
                    if(Objects.equals(dic[m], stri)){
                        t = listIntAppend(t, m);
                        u = listCharAppend(u, dic[m].charAt(dic[m].length() -1));
                        counter ++;
                        System.out.print("checking works");
//                        printIntArr(t);
//                        printCharArr(u);
                    }
                }
            }else{
                // add the char straight to the list
                t = listIntAppend(t, -1);
                u = listCharAppend(u,dic[l].charAt(0));
                System.out.println("result of u and t");
                printCharArr(u);
//                printIntArr(t);


            }

        }
        return (u.length);
    }
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        String example1 = "larlalacunelacostre";
        int[] emptyArr1 = {};
        char[] emptyArr2 = {};
        int result = LZencode(example1, emptyArr1, emptyArr2);
        System.out.println("result of function 1");
        System.out.print("testing with ");
        System.out.println(example1);
        System.out.println(result);
//        printCharArr(emptyArr2);
//        printIntArr(emptyArr1);
//        printCharArr(LZencode(example1, emptyArr1, emptyArr2));
        System.out.println("end of testing exercise 1");

    }
}

