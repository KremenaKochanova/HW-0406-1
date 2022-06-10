public class Main {
    static int m = 3;
    static int n = 3;
    public static void main(String[] args) {
        int i,j;
        int [][]matrix = new int[m][n];
        int x = 1; // x fills up the value of the matrix
         for (i = 0; i < m; i++)
               for (j = 0; j < n; j++)
                           matrix[i][j] = x++;
                   System.out.println("The matrix is : \n");
                   for (i = 0; i < m; i++) {
                       for (j = 0; j < n; j++) {
                           System.out.print(matrix[i][j] + "    ");
                       }
                       System.out.println();
                   }
                   System.out.println("\nPrinting the avg of each col ::");
                   average_columns(matrix);
               }
               public static void average_columns(int matrix[][]) {
                   int i, j;
                   double sum = 0, average = 0;
                   for (i = 0; i < matrix.length; i++) {
                       for (j = 0; j < matrix[i].length; j++) {
                           sum=sum+matrix[j][i];
                       }
                       average=sum/matrix[i].length;
                       System.out.println("Average of column " + (i+1) + " = " + average);
                       sum=0;

                       //the first project

       }
    }
}
