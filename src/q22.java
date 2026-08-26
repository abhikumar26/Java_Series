import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here...:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int cube = i*i*i;
            System.out.print(cube+ " ,");
        }
    }

}
