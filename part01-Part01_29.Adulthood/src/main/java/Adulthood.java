
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int n = scan.nextInt();
        if(n<18){
            System.out.println("You are not an adult");
        } else{
            System.out.println("You are an adult");
        }
    }
}
