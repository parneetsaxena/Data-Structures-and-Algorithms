package arrays;

public class SecondLargest {
    static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){ //{10,20,30,40,10,100}
           if(arr[i]>max){
               secondMax = max;
               max = arr[i];

           }else if(arr[i]>secondMax && arr[i]<max){
               secondMax = arr[i];
           }

        }
        return secondMax;
    }
    //Different approach for the same problem
    static int findSecLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,440,199,102,210};
        System.out.println(findSecLargest(arr));
    }
}
