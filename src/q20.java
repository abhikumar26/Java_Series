import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term here... :");
        int n = sc.nextInt();

        int firstnum = 0;
        int secnum = 1;
        int sum = 0;
        for (int i=1; i<=n; i++){
            System.out.print(firstnum);
            int c = firstnum+secnum;
            firstnum = secnum;
            secnum = c;

        }
        System.out.print("\nsum"+sum);
        sc.close();
    }

}
