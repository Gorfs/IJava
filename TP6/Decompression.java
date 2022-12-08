public class Decompression {

    public static String makeString (int[] t, char[] u, int i){
        String str ="";
        str += u[i];
        int position = t[i];
    do{
        str += u[position];
        position = t[position];
        }while (position != -1);

    // je dois reverse le string car elle est construit a l'envers
    String reverse = new StringBuilder(str).reverse().toString();
    return reverse;
    }
    public static String decompress (int[] t, char[] u){
        String result = "";
        String temp = "";
        int counter = 0;
        for(int i =0; i < t.length; i++){
            System.out.println(result);
            temp += u[i];
            if(t[i] == - 1){
                result += u[i];
            }else{
                result += makeString(t, u , i);
            }
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println("exercise 2, decompression");
        int[] arr1 = {-1, -1, -1, 0, 3, 2, -1, 4, -1, -1, -1, -1};
        char[] arr2 = {'l', 'o', 'u', 'a', 'c', 'n', 'e', 'u', 's', 't', 'r', 'e'};
        System.out.println(decompress(arr1, arr2));
    }
}
