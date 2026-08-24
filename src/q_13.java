import java.util.Scanner;
public class q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check palindrome : ");
        int n = sc.nextInt();

        int original = n;
        int palindrome = 0;

        while (n>0){
            int digit = n%10;
            palindrome = palindrome*10+digit;
            n = n/10;
        }
        if (original == palindrome){
            System.out.println("This is a Palindrome number...");

        }else{
            System.out.println("This is not a palindrome ");
        }

    }
}
