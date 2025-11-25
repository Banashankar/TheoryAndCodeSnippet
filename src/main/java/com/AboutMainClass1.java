package main.java.com;

public class AboutMainClass1 {
    public static void main(String[] args) {
        System.out.println("This is the main method with standard signature.");
    } //try to comment out this and check the error when you run the program.

    public static void main(int arg) {
        System.out.println("This is an overloaded main method with an integer argument: " + arg);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("This is another overloaded main method with two string arguments: " + arg1 + ", " + arg2);
    }
}
