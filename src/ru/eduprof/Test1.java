package ru.eduprof;

public class Test1 {

    int[] intArray = new int[3];


    public static void summation(int[] array_new = new int[3]){
        this.intArray=array_new;

        int sum = 0; // initialize sum
        int k;
        for (k = 0; k < array_new.length; k++)
            sum += array_new[k];
    }




}
