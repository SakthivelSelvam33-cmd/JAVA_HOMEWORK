import java.util.Scanner;

class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
		System.out.println("data");
        int n = sc.nextInt();

        // Original array
		System.out.println("arr data");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to insert
		System.out.println("element data");
        int element = sc.nextInt();

        // Position (1-based)
		System.out.println("position data");
        int position = sc.nextInt();

        // New array with size n+1
		System.out.println("newarr data");
        int[] newarr = new int[n + 1];

        // Insert element
        for (int i = 0; i < newarr.length; i++) {
            if (i < position ) {
                newarr[i] = arr[i];
            } else if (i == position ) {
                newarr[i] = element;
            } else {
                newarr[i] = arr[i - 1];
            }
        }

        // Print result
		System.out.println("result data");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
