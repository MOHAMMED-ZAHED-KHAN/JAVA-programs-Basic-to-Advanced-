
import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(age>=18?"Eligible":"NOT Eligible");

        scanner.close();
        

    }
    
}
