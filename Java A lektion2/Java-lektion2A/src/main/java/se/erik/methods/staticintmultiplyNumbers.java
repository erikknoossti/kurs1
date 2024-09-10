package se.erik.methods;

public class staticintmultiplyNumbers {
    public static void main(String[] args) {

        int myVariable = multiplyNumbers(3,5);
        System.out.println(myVariable);

    }
    static int multiplyNumbers(int a, int b){
        int product = a * b;
        return product;
    }

}
