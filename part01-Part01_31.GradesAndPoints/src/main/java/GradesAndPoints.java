
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points[0-100]");
        int n = scan.nextInt();
        
        if(n < 0){
            System.out.println("impossible!");
        } else if(n <= 49){
            System.out.println("Grade:failed");
        } else if(n <= 59){
            System.out.println("Grade:1");
        } else if(n <= 69){
            System.out.println("Grade:2");
        } else if(n <= 79){
            System.out.println("Grade:3");
        } else if(n <= 89){
            System.out.println("Grade:4");
        } else if(n <= 100){
            System.out.println("Grade:5");
        } else{
            System.out.println("incredible!");
        }

    }
}
