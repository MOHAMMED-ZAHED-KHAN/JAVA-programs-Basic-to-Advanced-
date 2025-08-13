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

      for(int i=1;i<n;i++)
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
