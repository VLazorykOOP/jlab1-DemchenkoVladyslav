import java.util.Scanner;

public class Task4 {
    public static void task() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arrOfStr = str.split("[, ?.'!;:-]+");
        StringBuilder sb = new StringBuilder();
        for (String s : arrOfStr
        ) {
            sb.setLength(0);
            String[] wrd = s.toLowerCase().split(Character.toString(s.charAt(0)));
            for (String w : wrd
            ) {
                sb.append(w);
            }
            System.out.print(sb + " ");
        }
    }
}