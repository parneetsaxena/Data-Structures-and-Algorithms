package arrays;

import java.util.Arrays;

public class SmallestAndLargest {

    static int [] smallestLargest(int[] arr){
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
        int[] result = {smallest,largest};
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {120,20,30,40,50,-21};
        System.out.println(Arrays.toString(smallestLargest(arr)));
        }
    }
