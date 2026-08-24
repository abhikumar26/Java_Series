import java.util.Scanner;
public class q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit numbers here :" );
        int n = sc.nextInt();

        int count = 0;
        while (n>0){
            n= n/10;
            count = count +1;
        }
        System.out.println("The total digits are " + count );

    }
}
