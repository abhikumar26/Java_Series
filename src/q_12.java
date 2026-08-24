import java.util.Scanner;
public class q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here to reverce :" );
        int n = sc.nextInt();

        int reverse = 0;
        while (n>0){
           int digit = n%10;
           reverse = reverse*10+digit;
           n=n/10;
        }
        System.out.print("The reverse digit is : " + reverse);



    }
}
