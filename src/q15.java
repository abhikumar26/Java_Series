import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here :");
        int num = sc.nextInt();

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num>0){
            int digit = num%10;
            sum = sum + Math.powExact(digit,digits);
            num = num/10;

        }
        if (sum == original){
            System.out.println(original+" This is an arm-strong number...");
        } else {
            System.out.println("This is not an arm-strong number");
        }

    }
}
