public class Exo3 {
    public static void main(String[] args) {
        System.out.println("start of exo3");
        printList(fibo(10));
    }

    public static void printList(int[] list) {
        // making a function that prints listes, since I can't be bothered writing for loops;
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i] + ", ");
        }
        System.out.print("]");
    }

    public static int[] fibo(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}
