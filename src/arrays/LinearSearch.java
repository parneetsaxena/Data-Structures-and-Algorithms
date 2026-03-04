package arrays;

import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {10, 44, 12, 19, 45};
        System.out.println(linearSearch(arr,100));
    }
}
