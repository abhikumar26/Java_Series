import java.util.Scanner;
public class q_10 {
    public static void main(String[] args) {
        //10. Find and print the product of all digits of a given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number is :" );
        int n = sc.nextInt();
        int product = 1;
        while (n>0){
            int digit = n%10;
            product = product*digit;
            n= n/10;
        }
        System.out.print(product);
    }
}
