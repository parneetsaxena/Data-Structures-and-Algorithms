package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
//        System.out.print("Enter the size of array: ");
//        int size = new Scanner(System.in).nextInt();
        int [] arr = {10,20,25,30};
        boolean isSorted = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted = false;
            }
        }
        System.out.println(isSorted);

    }
}
