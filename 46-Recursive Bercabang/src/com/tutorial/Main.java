package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        int n, nilaiFibonacci;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai N = ");
        n = userInput.nextInt();
        nilaiFibonacci = fibonacci(n, "Atas");
        System.out.println("Nilai fibonnaci ke - "+ n + " adalah " + nilaiFibonacci);
    }

    private static int fibonacci(int n, String daun){
        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke -" + n);
        if (n == 1 || n == 0){
            return n;
        }else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}
