package arrays;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        //If you do not provide the size, the program will terminate automatically
        System.out.print("Enter the size of array: ");
        int size = new Scanner(System.in).nextInt();
        int [] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter "+ size+ " elements in array: ");
//        for(int i =0;i<arr.length;i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for(int i:arr){
//            System.out.println(i+" ");
        int [] arr2 = arr.clone();
        arr[0] = 5;
        arr2[0] = 10;
        for(int j:arr2){
            System.out.print(j + " ");
        }
    }
}

