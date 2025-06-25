
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            
            int n = scanner.nextInt();
            if(n<0){
                System.out.println("Unsuitable number");
            } else if( n == 0){
                break;
            } else{
                System.out.println(n*n);
            }
            System.out.println("Give a number:");
        }
        System.out.println("Done!");
    }
}
