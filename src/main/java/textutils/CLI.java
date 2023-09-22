package main.java.textutils;

public class CLI {
    public static void imprimeLinha(String message) {
        System.out.println("> " + "-".repeat(64));
        System.out.println("> Deve " + message);
    }
}
