import java.util.Scanner;

public class Nevennumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*                                   SOMEWHAT IRRITATING METHOD
        
        
        System.out.print("Enter n value: ");

        int n = scanner.nextInt();

        System.out.println("First " + n + " even numbers are: ");

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        

        */

                                

        /*                                          EASY METHOD
        
        
        System.out.print("Enter n value: ");

        int n = scanner.nextInt();

        System.out.println(n + " Even numbers are: ");

        for(int i=0;i<n;i++)
        {
            System.out.println(2*i);
        }
      

        */

        scanner.close();

    }
}
