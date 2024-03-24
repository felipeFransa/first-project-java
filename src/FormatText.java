public class FormatText {

    public static void main (String [] args) {
        String firstName = "Felipe";
        int age = 27;
        double value = 55.9999;
        System.out.println(String.format("My name is %s, I have %d years old and today I spent %.2f dollar", firstName, age, value));

    }
}
