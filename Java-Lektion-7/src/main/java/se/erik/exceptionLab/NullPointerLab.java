package se.erik.exceptionLab;

import java.nio.charset.StandardCharsets;

public class NullPointerLab {
    public static void main(String[] args) {
        String name = null;

        if(name != null && name.equals("hakan")){
            System.out.println("namnet är håkan");
        }
        else{
            System.out.println("namnet är null");
        }
    }
}
