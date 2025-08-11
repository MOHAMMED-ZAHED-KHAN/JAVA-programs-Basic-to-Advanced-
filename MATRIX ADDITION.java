
public class MatrixAddition {
    public static void main(String[] args) {

        int[][]  mat1 = {{1,1,1},{1,1,1}};
        int[][]  mat2 = {{1,1,1},{1,1,1}};
        int[][]  result = {{0,0,0},{0,0,0}};

        for(int i =0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1.length;j++)
            {
                result[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
        
        for(int i =0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1.length;j++)
            {
            System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
