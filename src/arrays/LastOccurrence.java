package arrays;
import java.util.Scanner;
public class LastOccurrence {

    static int lastOccurrence(int [] arr,int target){
        int index = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,10,20,30,10,20};
        System.out.println(lastOccurrence(arr,9));
    }}

