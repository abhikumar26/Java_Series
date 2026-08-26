import java.util.Scanner;
public class q21 {
//    Print the square of each number from 1 to n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here :");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int square = i*i;
            System.out.println(square);
        }
        sc.close();
    }
}
