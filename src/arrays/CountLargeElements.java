package arrays;
import java.util.Scanner;
public class CountLargeElements {
    public static void main(String[] args) {
        int [] arr = {10,20,30,10,60,42,124,11,89};
        int count = 0;
        int target = new Scanner(System.in).nextInt();
        for(int i =0;i<arr.length;i++){

            if(arr[i]>target){
                count++;
            }

        }
        System.out.println(count);
    }
}
