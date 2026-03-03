package arrays;
import java.util.Arrays;
public class TwoDArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0]=2;
        matrix[0][1]=5;
        matrix[1][0]=10;
        matrix[1][1]=20;


        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
