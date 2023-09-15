import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        short n = scanner.nextShort();
        int[] arr = new int[2 * n];
        System.out.println("Array1:");
        for (int i = 0; i < n * 2; i++) {
            Random a = new Random();
            arr[i] = a.nextInt() % 10000;
            System.out.println(arr[i]);
        }
        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }
        avg /= n;
        System.out.println("Average number: " + avg);
        int[] arr2 = new int[n];
        int k = 0;
        for (int i = n; i < n * 2; i++) {
            if (arr[i] > avg) {
                arr2[k++] = arr[i];
            }
        }
        System.out.println("Array2: ");
        for (int i = 0; i < k; i++) {
            System.out.println(arr2[i]);
        }
    }
}