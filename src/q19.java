import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        //19. Print the Fibonacci series up to n terms.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n term here ");

        int n = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 1; i<=n; i++){
            System.out.print(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
