
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Shall we carry on?");
            String a = scanner.nextLine();
            if(a.equals("no") || a.equals("NO")){
                break;
            }
        }
        System.out.println("Done!");
    }
}
