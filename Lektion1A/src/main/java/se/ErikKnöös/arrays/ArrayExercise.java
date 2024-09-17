package se.ErikKnöös.arrays;

public class ArrayExercise {
    public static void main(String[] args) {


        int[] numbers = new int[100];
        int n = 1;


        for (int i = 0; i < 100; i++) {
            numbers[i] = n++;

        }

        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);

        }


    }


}
