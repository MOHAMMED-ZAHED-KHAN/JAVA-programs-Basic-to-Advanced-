import java.util.Scanner;

public class bubbleSort {
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
        System.out.println("Elements of the array Before sorting are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("What do you want to do: ");
        System.out.println("1 - Sort in Ascending order");
        System.out.println("2 - Sort in Descending order");
        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1-> 
            {
                for(int i=0;i<n;i++)
                    {
                        for(int j=0;j<n-1-i;j++)
                            {
                                if(arr[j]>arr[j+1])
                                    {
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                    }
                            }
                    }
                for(int i=0;i<n;i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
                System.out.println();
            }

      
            case 2 -> 
            {
                for(int i=0;i<n;i++)
                    {
                        for(int j=0;j<n-1-i;j++)
                            {
                                if(arr[j]<arr[j+1])
                                    {
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                    }
                            }
                    }
                for(int i=0;i<n;i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
                System.out.println();
            }

            default-> System.out.println("Invalid choice");

    }
    }
}
