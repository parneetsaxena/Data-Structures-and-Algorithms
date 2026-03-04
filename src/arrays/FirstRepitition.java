package arrays;

public class FirstRepitition {
    static int findFirstRepitition(int[] arr){
        int rep = -1;
        for(int i = 0;i<arr.length;i++){
           for(int j = i+1;j<arr.length;j++){
               if(arr[i]==arr[j])
                   return arr[i];

           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,40,10,40,20,50};
        System.out.println(findFirstRepitition(arr));
    }
}
