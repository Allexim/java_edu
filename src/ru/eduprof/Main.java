package ru.eduprof;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("The programme of computing of the sum of 3 integer numbers\n");

        // declares an Array of integers.
        int[] array_new;
        int num = 3;                //size of array

// allocating memory for 3 integers.
        array_new = new int[num];

        int sum_of_int;




        // accessing the elements of the specified array
        for (int i = 0; i < array_new.length; i++) {
            System.out.print("Input #" + (i+1) + ": ");

            array_new[i] = number_output();


        }

        int sum = 0; // initialize sum
        int k;

        // Iterate through all elements and add them to sum
        for (k = 0; k < array_new.length; k++)
            sum += array_new[k];



        System.out.println("");
        System.out.println("The sum of numbers = "+sum);






    }

    public static int number_output() {
        Scanner scanner = new Scanner(System.in);
        int user_number = scanner.nextInt();
        return user_number;
    }






}
