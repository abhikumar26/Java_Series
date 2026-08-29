import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
//  26. Find the HCF (Highest Common Factor) of two given numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number :");
        int num2 = sc.nextInt();

        int hcf = 1;
        int smaller = (num1<num2) ? num1 : num2;

        for (int i = smaller; i>=1; i--){
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
                break;
            }
        }
        System.out.println("HCF of " + num1 + " and " +num2 + "is :" + hcf);

    }
}
