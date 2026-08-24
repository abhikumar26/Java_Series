import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Comp_code {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Element :");
        int n = sc.nextInt();

        //Taking input to array list--2
        System.out.println("Enter" + n + "Elements");
        for (int i=0; i<n; i++){
            int value = sc.nextInt();
            number.add(value);

        }
        System.out.println("You entered"+number);




    }
}
