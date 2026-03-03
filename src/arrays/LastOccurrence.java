package arrays;
import java.util.Scanner;
public class LastOccurrence {
    public static void main(String[] args) {
        int [] arr = {10,20,30,10,20,30,10,20};
        int index= -1;
        int target = new Scanner(System.in).nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }else{
        System.out.println("The last occurrence of " + target + " is at index " + index);
    }}
}
