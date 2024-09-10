package se.erik.methods;

public class returnCreateFullName {
    public static void main(String[] args) {

        String minVariabel = createFullName("Erik", "Knoos");
        System.out.println(minVariabel);

    }

    static String createFullName(String firstname, String lastname){
        String combined = firstname + " " + lastname;
        return combined;
    }
}
