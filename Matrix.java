package scratch;

public class Matrix {
    int[][] entries;
    int x,y;
    
    public Matrix(int[][] fill )
        {
            x = 4;
            y = 4;
            entries = new int[x][y];
            for(int i = 0 ; i < 4 ; i++)
                for(int j = 0 ; j < 4 ; j++)
                    entries[i][j] = fill[i][j];
        }
    public void Print()
    {
        for(int i = 0 ; i < x ; i++)
        {
            System.out.println();
            for(int j = 0 ; j < y ; j++)
                System.out.print(entries[i][j]);
        }
    }
    public int[] getRow(int n)
    {
        int[] row = new int[4];
        for(int i = 0 ; i < 4 ; i++)
            row[i] = entries[n][i];
        return row;            
    }
    public int[] getColumn(int n)
    {
        int[] column = new int[4];
        for(int i = 0 ; i < 4 ; i++)
            column[i] = entries[i][n];
        return column;            
    }
    public int multiply(int[] row, int[] column)
    {
        int x = 0;
        for(int i = 0 ; i < 4 ; i++)
            x += row[i]*column[i];
        return x;
    }
    public void matrixMultiply(Matrix factor)
    {
        int placeholder = 0;
        int[][] temp = new int[4][4];
        int[] temprow = new int[4];
        int[] tempcolumn = new int[4];
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                temprow = getRow(i);
                tempcolumn = factor.getColumn(j);
                placeholder = multiply(temprow,tempcolumn);
                temp[i][j] = placeholder;
            }
                
        }
        for(int i = 0 ; i < 4 ; i++)
            for(int j = 0 ; j < 4 ; j++)
                entries[i][j] = temp[i][j];

    }
}
