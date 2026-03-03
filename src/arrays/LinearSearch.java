package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,44,12,19,45};
        int target = new Scanner(System.in).nextInt();
        int index = -1;
        for(int i = 0; i<arr.length; i++){
           if(arr[i]==target){
               index = i;
               break;
           }
        }
        if(index==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + index);
        }
    }
}
