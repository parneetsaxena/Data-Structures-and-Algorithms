package arrays;

public class MaxValue {

    static int maxValue(int[] arr){
        int max = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {10,31,40,59,1001};
        System.out.println(maxValue(arr));
    }
}
