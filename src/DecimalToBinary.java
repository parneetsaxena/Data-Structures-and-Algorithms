import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        int binary = 0;
        int power = 1;
        while(decimal>0){
            int unit = decimal%2;
            binary += (unit * power);
            decimal/=2;
            power = power *10;
        }
        System.out.println("The output: "+binary);
    }
}
