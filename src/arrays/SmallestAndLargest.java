package arrays;

import java.util.Arrays;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int [] arr = {120,20,30,40,50,-21};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }

            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int [] result = {smallest,largest};
        for(int i:result){
            System.out.println(i);
        }
    }
}
