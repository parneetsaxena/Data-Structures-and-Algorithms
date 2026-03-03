package arrays;

public class MaxValue {
    public static void main(String[] args) {
        int [] arr = {10,31,4,59,100};
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
