import java.util.Scanner;
public class q_9 {
    public static void main(String[] args) {
//        9. Calculate and print the factorial of a given number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the foctorial number :");
        int n = sc.nextInt();

        long factorial = 1;
        for (int i=1; i<=n; i++){
        factorial *= i;
        }
        System.out.println("The factorial of the given number " + n + " is " + factorial);

    }
}
