
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int n = scan.nextInt();
        
        if(n >= 0 && n<5000){
            System.out.println("No tax!");
        } else if(5000 <= n && n < 25000){
            System.out.println("Tax:" + (100.0 + (0.08*(n-5000))));
        } else if(25000 <= n && n < 55000){
            System.out.println("Tax:" + (1700 + (0.1*(n-25000))));
        } else if(55000 <= n && n < 200000){
            System.out.println("Tax:" + (4700 + (0.12*(n-55000))));
        } else if(200000 <= n && n < 1000000){
            System.out.println("Tax:" + (22100 + (0.15*(n-200000))));
        } else if(n >= 1000000){
            System.out.println("Tax:" + (142100 + (0.17*(n-1000000))));
        } else{
            System.out.println("Impossible value");
        }

    }
}
