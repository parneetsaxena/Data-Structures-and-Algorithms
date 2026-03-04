package arrays;

public class SecondLargest {
    static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
           if(arr[i]>max){// Check for max value
               secondMax = max; // Update the secondMax with previous max
               max = arr[i]; // Current max value

           }else if(arr[i]>secondMax){// To check if secondMax value is correct
               secondMax = arr[i];
           }

        }
        return secondMax;
    }
    //Different approach for the same problem
    static int findSecLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // To get the max from the array
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // Replacing max with Integer.MIN_VALUE
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        //Traversing the array again to find the second largest
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,440,199,102,210};
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecLargest(arr));

    }
    // Time complexity = O(n)
    //Space Complexity = o(1)
}
