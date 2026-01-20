import java.util.Scanner;

class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();

        // Original array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to insert
        int element = sc.nextInt();

        // Position (1-based)
        int position = sc.nextInt();

        // New array with size n+1
        int[] newarr = new int[n + 1];

        // Insert element
        for (int i = 0; i < newarr.length; i++) {
            if (i < position - 1) {
                newarr[i] = arr[i];
            } else if (i == position - 1) {
                newarr[i] = element;
            } else {
                newarr[i] = arr[i - 1];
            }
        }

        // Print result
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
