package se.erik.methods;

public class MethodExercisevoid {
    public static void main(String[] args) {

      /*  //hello("Nibras");
        name_age("Erik", 21); //static void metod tillkallar metoden   ex static void

        int minVariabel = myNumber(); // return metod lagrar i minVariabel   ex return String
        System.out.println(minVariabel);

        String minVariabel1 = hello();
        System.out.println(minVariabel1);

        int minVariabel2 = returnANumberwithparams(10);
        System.out.println(minVariabel2);
*/
        int minVariabel3 = addTwoNumvers(103, 15);
        int minVariabel4 = addTwoNumvers(104, 15);
        int minVariabel5 = addTwoNumvers(10, 15);
        System.out.println("103 * 15 = " + minVariabel3);
        System.out.println("104 * 15 = " + minVariabel4);
        System.out.println("10 * 15 = " + minVariabel5);

        int minVariabel6 = addTwoNumbers1(5,6);
        System.out.println("5 + 6 = " + minVariabel6);

        String minVariabel7 = enterNameAndAge("Erik", 21);
        System.out.println(minVariabel7);

    }

    static String enterNameAndAge(String name, int age) {
        System.out.println("I am from enterNameAndAge");
        String s = "My name is " + name + " and im " + age + " years old";
        return s;
    }

    static int returnANumberwithparams(int number){
        System.out.println("i am from returnANumberwithparams " + number);
      return number;


    }

    static int addTwoNumvers(int number1, int number2){
       int sum = number1 * number2;
       return sum;

    }

    static int addTwoNumbers1(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    static String hello(){
        return "Hello";


}

    static void greet(){
        System.out.println("Hello");
    }

    static void bye(){
        System.out.println("Bye");
    }

    static void hello(String name){
        System.out.println("hello " + name);
    }

    static void name_age(String name, int age){
        System.out.println("Hello my name is " + name + " i am " + age + " years old ");
    }

    static int myNumber(){
        System.out.println("My number is ");
        return 10;
    }



}


// struktur = static void name {
//}