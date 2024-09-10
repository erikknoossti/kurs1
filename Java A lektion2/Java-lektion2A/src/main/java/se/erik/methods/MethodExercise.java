package se.erik.methods;

public class MethodExercise {
    public static void main(String[] args) {
        String name = "Thomas";
        System.out.println("Hello my name is " + name);

        greet();
        bye();

    }

    static void greet(){
        System.out.println("Hello");
    }

    static void bye(){
        System.out.println("Bye");
    }

}
