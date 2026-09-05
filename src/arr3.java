public class arr3 {
    public static void main(String[] args) {
//        Calculate an avg marks of an array containing marks of
//        every student--
        int [] marks = {12,34,56,7,88};
        int sum = 0;

        for (int i=0; i< marks.length; i++){
            sum = sum+marks[i];
        }
        System.out.print(sum/ marks.length);


    }
}
