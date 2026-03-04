package arrays;

public class LastOccurrence {

    static int findLastOccurrence(int [] arr, int target){
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
        System.out.println(findLastOccurrence(arr,9));
    }}

