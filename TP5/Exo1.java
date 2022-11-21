public class Exo1{

    public static void printArrayOfArrays(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("");
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
            System.out.println("");
        }
    }

    public static int[] rowSums(int[][] arr) {
        int[] result = new int[arr.length];
        int sum = 0;
        for(int i =0 ; i < arr.length; i++){
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Grand 1");
        int[][] test1 = { {1,2,3,4,5} ,{2, 3 ,4 ,1}};
        printArrayOfArrays(test1);
        printArr(rowSums(test1));
    }
}