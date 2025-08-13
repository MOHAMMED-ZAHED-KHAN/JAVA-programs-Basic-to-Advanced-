
import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the size of the array: ");
      int n = scanner.nextInt();

      int [] arr = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int i=0;i<n;i++)
      {
        arr[i]=scanner.nextInt();
      }

      System.out.println("The elements of the array are: ");
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }

      int l = arr.length;
      int m = Math.floorDiv(l, 2);
      
      for(int i=0;i<m;i++)
      {
        int temp = arr[i];
        arr[i]=arr[l-1-i];
        arr[l-1-i]=temp;
      }
      System.out.println("The Reverse of the array is: ");
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }



      scanner.close();
    }
}
