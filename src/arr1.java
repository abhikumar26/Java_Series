import java.util.Scanner;
public class arr1 {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.
        float [] marks = {1.22f, 67.34f, 79.22f, 90.34f};
        float sum = 0;
        for (int i=0; i< marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
