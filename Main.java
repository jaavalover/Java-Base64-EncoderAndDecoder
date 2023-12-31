package me.lars;

import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    static void start(){
        System.out.println();
        System.out.print("\u001B[35m"); // ANSI PURPLE
        System.out.print("Base64 Encoder & Decoder");
        System.out.print("\u001B[0m"); // ANSI RESET
        System.out.println(" by lars.dev ");
        System.out.println("Please select an option:");
        System.out.println();
        System.out.println("[1] Encoding");
        System.out.println("[2] Decoding");
        System.out.println("[3] Quit");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String selected = scanner.nextLine();

        switch (selected) {
            case "1":
                encode();
                break;
            case "2":
                decode();
                break;
            case "3":
                quit();
                break;
            default:
                System.out.print("\u001B[31m"); // ANSI RED
                System.out.println("Invalid Option");
                System.out.print("\u001B[0m"); // ANSI RESET
                start();
        }
    }

    static void encode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Base64 Encoder");
        System.out.println("Enter text to encode:");
        System.out.println();

        String text = scanner.nextLine();

        byte[] encodedBytes = Base64.getEncoder().encode(text.getBytes());
        String encodedText = new String(encodedBytes);
        System.out.println("Base64 encoded: " + encodedText);
        start();
    }

    static void decode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Base64 Decoder");
        System.out.println("Enter text to decode:");
        System.out.println();

        String encodedText = scanner.nextLine();

        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        String decodedText = new String(decodedBytes);
        System.out.println("Base64 decoded: " + decodedText);
        start();
    }

    static void quit(){
        System.out.println("Goodbye!");
    }
}
