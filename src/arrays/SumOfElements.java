package arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr= {1,45,12,19,51,34};

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
