import java.util.Scanner;

public class sample {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Hello");
      System.out.printf("Before u get into this program ... \n");
      System.out.printf("Remember for Matrix Addition Dimensions must be equal.. \n");
      System.out.println("Now u can proceed");

      System.out.println("Enter n and m value: ");
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      System.out.println("Enter p and q value: ");
      int p = scanner.nextInt();
      int q = scanner.nextInt();

      if(n==p && m==q)
      {

      System.out.println("Enter first matrix: ");
      int [][] m1 = new int[n][m];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          m1[i][j]=scanner.nextInt();
        }

      }

      System.out.println("Enter 2nd matrix: ");
      int [][] m2 = new int[p][q];
      for(int i=0;i<p;i++)
      {
        for(int j=0;j<q;j++)
        {
          m2[i][j]=scanner.nextInt();
        }
      }
      
        
      System.out.println("ist Matrix is: ");
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          System.out.print(m1[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("2nd Matrix is: ");
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          System.out.print(m2[i][j] + " ");
        }
        System.out.println();
      }

      int [][] sum = new int[n][m];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          sum[i][j]=m1[i][j]+m2[i][j];
        }
      }
      System.out.println("Sum of the array is: ");
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          System.out.print(sum[i][j] + " ");
        }
        System.out.println();
      }

    }
    else
    {
      System.out.println("Oops Dimensions are not correct!!!");
      System.out.println("I told u Dimensions must be equal");
    }

      scanner.close();

    }

}
