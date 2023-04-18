package GroupProjectExercise;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        /*Write a java program to check whether a given
number is prime or not?*/

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();

        if (n <= 1) {

            System.out.println("it's not a prime number");

        }

        if (n > 2 && n % 2 == 0) {

            System.out.println("it's not a prime number");
        } else {
            int i = n / n;

            for (int j = 2; j < i; j++) {


                if (n / 1 == n && n % 2 != 0) {


                }
            }
            System.out.println("it's a prime number");
        }
    }}