import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class While_loop {
    // Method to calculate sum of even numbers up to n
    public static int EvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Take input from user

        // Call the method and print result
        System.out.println("Sum of all even numbers up to " + n + " = " + EvenNumbers(n));
    }
}

//      1. Print all numbers from 1 to 10 using a loop.
//        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i++;

//      2. Print numbers from 10 down to 1 in reverse order.
//        int i = 10;
//        while (i>=1){
//            System.out.println(i);
//            i--;

//        3. Print all even numbers between 1 and 100.
//          int i = 2;
//          while (i<=100){
//              System.out.println(i);
//              i+=2;
//          }
//        4. Print all odd numbers between 1 and 100.
//        int i = 1;
//        while (i<=100){
//            System.out.println(i);
//            i+=2;
//        }
//        5. Print the multiplication table of a given number from n × 1 to n × 10.
//        System.out.println("Enter a number :" );
//        int n = sc.nextInt();
//
//        int i = 1;
//        while (i<=10){
//            System.out.println(n + "*" + i + "=" + (n*i));
//            i++;
//        }
//        6. Calculate and print the sum of the first n natural numbers.--
//        System.out.println("Enter your number here :");
//        int n = sc.nextInt();
//        int sum = n*(n+1)/2;
//        System.out.println("sum of first " + n + " natural numbers are " + sum);

//        7. Calculate the sum of all even numbers from 1 up to n.--






