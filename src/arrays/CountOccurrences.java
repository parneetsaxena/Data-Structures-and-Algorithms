package arrays;
import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        int [] arr = {10,40,11,10,34,10,44};
        int count = 0;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int target = scanner.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if(count==0){
            System.out.println("Array does not contain "+ target);
        }else{
        System.out.println(target + " has appeared "+ count+ " times in the array");
    }}
}
