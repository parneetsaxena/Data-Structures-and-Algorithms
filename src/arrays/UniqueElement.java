package arrays;

public class UniqueElement {
    static int uniqueElement(int[] arr){
        int unique = -1;
        for(int i = 0;i<arr.length;i++){ //{2,5,1,3,2,5,8}
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i:arr){
            if(i>-1){
                unique = i;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,2};
        System.out.println(uniqueElement(arr));
    }
}
