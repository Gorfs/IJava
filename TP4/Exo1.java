public class Exo1 {
    public static void printList(int[] list) {
        // making a function that prints listes, since I can't be bothered writing for loops;
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i] + ", ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        System.out.println("start of exo1");
        int[] testArray1 = { 1, 2, 3, 5, 67 };
        int[] testArray2 = { 32, 42563, 67542754, 7 };
        System.out.println(search(testArray1, 5));
        printList(union(testArray1, testArray2));
    }

    public static boolean search(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;

    }
    
    public static int[] union(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            result[array1.length + j] = array2[j];
        }
        return result;
    }
}