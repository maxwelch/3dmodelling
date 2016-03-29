public class Scratch {

    public static void main(String[] args) {
        int[][] fill = 
        {
            {1,2,3,0},
            {2,3,4,0},
            {3,4,5,0},
            {0,0,0,1}
        };
        Matrix test = new Matrix(fill);
        int[][] identity = 
        {
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,0}
        };
        Matrix another = new Matrix(identity);
        test.Print();
        test.matrixMultiply(another);
        test.Print();
        another.Print();
    }
    
}
