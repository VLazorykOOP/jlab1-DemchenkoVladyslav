import java.util.Scanner;

public class Task1 {
    public static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextFloat();
        System.out.println("Enter b:");
        double b = scanner.nextFloat();
        if (a != 0 && b != 0)
            System.out.println("(a*b - (a+b)*(a-b))/(b*b*b*b + a*a*a) = " + (a * b - (a + b) * (a - b)) / (b * b * b * b + a * a * a));
        else System.out.println("Wrong data");
    }
}