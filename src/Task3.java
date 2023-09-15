import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        short n = scanner.nextShort();
        int[][] matr = new int[n][n];
        double[] vect = new double[n];
        Random a = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = a.nextInt() % 100;
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Vector:");
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matr[i][j];
            }
            vect[i] = sum/n;
            System.out.print(vect[i] + " ");
        }

    }
}