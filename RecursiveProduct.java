import java.util.Scanner;

public class RecursiveProduct {

    //Returns product of five numbers.
    //Each recursion processes a single unit

    public static int calcProduct (int[] numbers, int n) {

        //Base Case, One number remains --> return it
        if (n == 1) {
            return numbers[0];
        }
        //Recursive Case, Multiply current number by
        //product of the remaining numbers
        else {
            return numbers[n - 1] * calcProduct(numbers, n - 1);
        }
    }

    public static void main (String[] args) {

        Scanner scnr = new Scanner(System.in);

        //Array that stores numbers with a constant of 5
        final int NUM_VALUES = 5;

        int[] numbers = new int[NUM_VALUES];
        int product;
        int i;

        System.out.println("Enter Five Numbers:");

        for (i = 0; i < NUM_VALUES; ++i) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scnr.nextInt();
        }
        //Calculate product using recursion
        product = calcProduct(numbers, NUM_VALUES);

        System.out.println();
        System.out.println("Product = " + product);

        scnr.close();
    }
}