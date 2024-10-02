package se.erik.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //ARRAYS

        //En lista av datatyper eller objekt

        //datatyp = int, double float eller char,
        //objekt = String
/*
        int[] v = new int[5];// sätt 1
        for(int i = 0; i < v.length; i++){
            System.out.println("Skriv in värde: ");
            v[i] = in.nextInt();  // mata in värden till arrayen

            /*
            v[0] = 5
            v[1] = 8
            v[2] = 3
            osv



        }

        System.out.println(Arrays.toString(v));
        System.out.println("Index 0 = " + v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println(v[3]);

        //Ändra på värde i arrayen

        v[0] = 20;
        System.out.println(Arrays.toString(v));
        */
        //ANDRA SÄTTET

        int [] v2= {1,4,6,7,9};
        System.out.println(v2[3]);

        v2[4] = 50;
        System.out.println(Arrays.toString(v2));

        int sum = 0;
        for(int i = 0; i < v2.length; i++){
            sum+=v2[i];

        }


    }

}


