import java.util.Scanner;
public class q_11 {
    public static void main(String[] args) {
//  11. Count and print the total number of digits in a given number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit numbers here :" );
        int n = sc.nextInt();

        int count = 0;
        while (n>0){
            n= n/10;
            count = count +1;
        }
        System.out.print("The total digits are " + count );

    }
}
