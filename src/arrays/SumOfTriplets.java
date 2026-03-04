package arrays;

public class SumOfTriplets {
    static int findSumOfTriplets(int[] arr, int target){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,30,40,60,80,50,100};
        System.out.println(findSumOfTriplets(arr,150));
    }
}
