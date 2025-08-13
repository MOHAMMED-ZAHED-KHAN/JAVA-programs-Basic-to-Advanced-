
import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = {1,2,3,4,5,6};
        int l=arr.length;
        int n = Math.floorDiv(l,2);
        System.out.println("Elements are: ");
        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        System.out.println("Reverse is: ");
        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }


        scanner.close();
    }
}
