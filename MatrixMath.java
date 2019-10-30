
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
         this.data = data;
        // initialise instance variables
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[] sumRow = new int[data.length];
        
        
        
        
        for(int i = 0; i<data.length; i++){
            int sum = 0;
            for (int j = 0; j<data[i].length; j++){
                sum+=data[i][j];
            }
            sumRow[i] = sum;
        }
        return sumRow;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        double[] aveRow = new double[data.length];
        
        for (int i = 0; i<data.length; i++){
            double sum = 0;
            for(int j = 0; j<data[i].length; j++){
                sum += data[i][j];
                
            }
            aveRow[i] = sum/(data[0].length);
        }
        
        return aveRow;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int column = data[0].length;
        int[] sumCol = new int [column];
        for (int i = 0; i<column; i++){
            int sum = 0;
            for (int j = 0; j<data.length; j++){
                sum+=data[j][i];
            }
            sumCol[i] = sum;
        }
        return sumCol;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        int column = data[0].length;
        double[] aveCol = new double [column];
        for (int i = 0; i<column; i++){
            double sum = 0;
            for (int j = 0; j<data.length; j++){
                
                sum+=data[j][i];
            }
            aveCol[i] = sum/column;
        }
        return aveCol;
    }
    
}
