package arrays;

public class SumOfPair {

    static int sumOfPair(int[] arr,int target){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,10,11,3,5,0,7};
        System.out.println((sumOfPair(arr,8)));
    }
}
