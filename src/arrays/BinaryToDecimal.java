package arrays;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int binary = scanner.nextInt();
        int power = 1;
        int ans = 0;
        while(binary>0){
            int unit = binary%10;
            ans += (power * unit);
            binary/=10;
            power = power*2;

        }
        System.out.println("the output is: "+ans);
    }
}
