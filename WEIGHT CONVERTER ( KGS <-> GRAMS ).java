import java.util.Scanner;

public class sample {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      double weight ;
      double newWeight;
      int choice ;

      System.out.println("Welcome to Weight converter calculator: ");
      System.out.println("1. Convert Kgs into Grams: ");
      System.out.println("2. Convert Grams into Kgs: ");
      System.out.println("Enter your choice: ");

      choice = scanner.nextInt();

      if(choice==1)
      {
        System.out.println("Please enter weight in Kgs to convert into Grams: ");
        weight = scanner.nextDouble();
        newWeight = weight * 1000 ; 
        System.out.printf("Weight in Grams is: %.2f" , newWeight);
      }

      else if(choice==2)
      {
        System.out.println("Please enter weight in Grams to convert into Kgs: ");
        weight = scanner.nextDouble();
        newWeight = weight / 1000 ; 
        System.out.printf("Weight in Kgs is: %.2f" , newWeight);
      }

      else
      {
        System.out.println("Invalid Choice");
      }


      scanner.close();


    }

}
