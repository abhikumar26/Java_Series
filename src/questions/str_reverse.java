package questions;
import java.util.Scanner;

public class str_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to reverse...!");
        String n = sc.nextLine();

        String reverse = "";
        for (int i = n.length()-1; i>=0; i--){
            reverse = reverse +n.charAt(i);
        }
        System.out.println("The revese string is :" + reverse);
    }
}
