package arrays;
import java.util.Arrays;

public class KthSmallestAndLargest {

    static int [] findKthSmallAndLarge(int [] arr, int min, int max){
        Arrays.sort(arr);
        int minIndex = arr[min-1];
        int maxIndex = arr[arr.length-max];
        return new int[]{minIndex,maxIndex};
    }

    public static void main(String[] args) {
        int [] arr = {10,4,6,11,59,22};
        System.out.println(Arrays.toString(findKthSmallAndLarge(arr,2,3)));
    }
}
