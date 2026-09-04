import java.util.Scanner;
public class arr2 {
    public static void main(String[] args) {
//        find out weather the given integer is present in an array
//                or not
        int [] marks = {90, 80, 89 , 100, 70};
        int num = 911;
        boolean isInArray = false;
        for (int i=0; i<marks.length; i++){
            if (num == marks[i]){
                isInArray =true;
                break;
            }
        }
        if (isInArray){
            System.out.print("The value is present in array");
        } else {
            System.out.print("The value is not present in array");
        }
    }
}
