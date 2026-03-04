package arrays;

public class SumOfElements {

    static int findSumElements(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr= {1,45,12,19,51,34};
        System.out.println(findSumElements(arr));
    }
}
