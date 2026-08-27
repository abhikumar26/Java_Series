import java.util.Scanner;
public class q24 {
    public static void main(String[] args) {
//    24. Print all factors of the given number--
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here :");
        int n = sc.nextInt();

        for (int i=1; i>=n; i++){
            if (n%i == 0){
                System.out.println(i);
            }
        }

    }
}
