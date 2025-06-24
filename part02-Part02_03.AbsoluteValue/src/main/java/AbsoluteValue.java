import java.util.Scanner;

public class AbsoluteValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number:");
        int n = sc.nextInt();
        
        if(n<0){
            System.out.println(n*-1);
        } else{
            System.out.println(n);
        }
        
    }
}