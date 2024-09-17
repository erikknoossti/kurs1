package se.erik.exceptionLab;

public class Exceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //divide(10,0);

       /* try{
            System.out.println(a / b);
            System.out.println("Programmet avslutas");
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
      */  System.out.println("Efter try och catch");
    }

    public static int divide(int a , int b) throws ArithmeticException{
        return a / b;
    }

}
