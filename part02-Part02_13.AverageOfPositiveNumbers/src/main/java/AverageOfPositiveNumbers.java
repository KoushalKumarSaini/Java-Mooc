
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            
            if(n == 0){
                break;
            } else if(n > 0){
                count = count + 1;
                sum = sum + n;
            } else{
                continue;
            }
        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        }
        System.out.println("Average of positive numbers: " + (double)sum/count);
    }
}
