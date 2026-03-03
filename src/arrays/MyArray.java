package arrays;
import java.sql.Array;
import java.util.Arrays;
public class MyArray {
    public static void main(String[] args) {
        // Syntax to create an array: dataType [] = new dataType[size];

        String []names = new String[20]; // Array initialization using instantiation
        double [] weight = {56.3,67.9,60.2}; // Without instantiation
        int[] age = new int[5];
        age[0] = 23;
        age[1] = 50;
        age[3] = 45;
//        System.out.println(age[0]+ " "+ age[1]+ " "+age[3]+ " "+age[2]);

//        for(int i = 0;i<weight.length;i++){
//            System.out.println(weight[i]);
//        }
//        for(int i=0;i<age.length;i++){
//            System.out.println(age[i]);
//        }
        // For each loop
        for(int ages:age){
            System.out.println(ages);
        }
    }
}
