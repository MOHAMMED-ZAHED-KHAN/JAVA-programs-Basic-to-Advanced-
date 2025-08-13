import java.util.Scanner;

public class searchingInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the size of an array:");
      int n = scanner.nextInt();

      System.out.println("size of the array is " + n);
      int[] num = new int[n];
      
      System.out.println("Enter the elements of the array: ");
      for(int i=0;i<n;i++)
      {
        num[i]=scanner.nextInt();
      }
      System.out.println("Elements of the array are: ");
      for(int i=0;i<n;i++)
      {
        System.out.println(num[i]);
      }

      System.out.println("Enter the value to find in the array: ");
      int f = scanner.nextInt();
      boolean isInarray = false;

      for (int i=0;i<n;i++) {
          if(f==num[i])
          {
            isInarray=true;
            break;
          }
      }
      if(isInarray)
      {
        System.out.println("found");
      }
      else
      {
        System.out.println("not found");
      }

      System.out.println("end");


      scanner.close();
    }
}
