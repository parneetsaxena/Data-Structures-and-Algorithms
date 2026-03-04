package arrays;

public class CountOccurrences {
    static int countOccurrence(int [] arr,int target){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if(count==0){
            return 0;
        }else{
            return count;
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,40,11,10,34,10,44};
        System.out.println(countOccurrence(arr,20));
    }
}

