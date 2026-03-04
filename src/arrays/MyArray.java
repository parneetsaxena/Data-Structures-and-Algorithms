package arrays;
import java.sql.Array;
import java.util.Arrays;
public class MyArray {
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // Syntax to create an array: dataType [] = new dataType[size];

        String []names = new String[20]; // Array initialization using instantiation
        double [] weight = {56.3,67.9,60.2}; // Without instantiation
        int[] age = new int[5];
        age[0] = 23;
        age[1] = 50;
        age[3] = 45;
        printArray(age);
    }
}
