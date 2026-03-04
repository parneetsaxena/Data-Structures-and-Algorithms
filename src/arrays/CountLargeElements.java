package arrays;

public class CountLargeElements {

    static int findLargerElements(int [] arr, int target){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,10,60,42,124,11,89};
        System.out.println(findLargerElements(arr,20));
    }
}
