import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int factorial = 1;
        System.out.print("Enter the n value: ");

        int n = scanner.nextInt();

        for(i=1;i<=n;i++){
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        
        scanner.close();

    }
}
