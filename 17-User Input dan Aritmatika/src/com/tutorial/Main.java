package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ambil input dari user
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas;

        /*perhitungan luas persegi panjang
        luas = panjang * lebar
         */
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.printf("Luas = %d * %d = %d",panjang,lebar,luas);
    }
}
