package com.tutorial;

public class Main {

    public static void main(String[] args) {
        angka(10);
        angka(10.5f);
        angka(11.2d);
    }

    //menggunakan nama fungsi yang sama tapi beda argumen

    private static void angka(int angka){
        System.out.println("Angka Integer = " + angka);
    }

    private static void angka(float angka){
        System.out.println("Angka Float = " + angka);
    }

    private static void angka(double angka){
        System.out.println("Angka Double = " + angka);
    }
}
