import java.util.Scanner;

public class q_8 {
    public static void main(String[] args) {
//        8. Calculate the sum of all odd numbers from 1 up to n.
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here :");
        int n = sc.nextInt();

        int m = (n%2 == 0) ? n-1 : n;
        int k= ((m+1)/2);
        int sum = k*k;



        System.out.println("The sum of all odd numbers from 1 up to " + n + " is " + sum );
    }
}
