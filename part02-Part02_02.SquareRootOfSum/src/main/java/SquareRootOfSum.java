
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.sqrt(a+b));

    }
}
