import java.util.Scanner;
public class q25 {
    public static void main(String[] args) {
        //25. Find and print the sum of all factors of the given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here :");
        int n = sc.nextInt();

        int sum = 0;
        for (int i=1; i<=n; i++){
            if (n%i == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of number is :" + sum);

    }
}
