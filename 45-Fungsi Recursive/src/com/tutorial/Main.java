package com.tutorial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int nilai, jumlah;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        nilai = userInput.nextInt();
        jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah Nilai = " + jumlah);
    }

    //Fungsi Recursive
    private static int jumlahNilai(int parameter){
        System.out.println("Nilai = " + parameter);

        if(parameter == 0){
            return parameter;
        }

        //Recursive
        return parameter + jumlahNilai(parameter - 1);

    }
}
