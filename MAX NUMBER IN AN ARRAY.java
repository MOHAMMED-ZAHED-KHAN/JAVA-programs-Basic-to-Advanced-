import java.util.Scanner;

public class sample {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the size of the array: ");
      int n = scanner.nextInt();
      
      System.out.println("Enter the elements of the array: ");
      int [] arr = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=scanner.nextInt();
      }
      System.out.println("Elements of the array are: ");
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
      
      int max = arr[0];
        //    (or)   int max = Integer.MIN_VALUE;  --> with this program will work for both positive and negative values.....

      for(int i=1;i<n;i++)  // if we will use " int max = Integer.MIN_VALUE; " then  --> in for loop we will initialise i value to 0
      {
        if(arr[i]>max)
        {
          max=arr[i];
        }
      }
      System.out.println("Greatest element in the array is: " + max);

      scanner.close();

    }

}
