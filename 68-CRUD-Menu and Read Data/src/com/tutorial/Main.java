package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner consoleInput = new Scanner(System.in);
        String option;
        boolean isContinue = true;

        while (isContinue) {
            clearScreen();
            System.out.println("Perpustakaaan Kami\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari buku");
            System.out.println("3.\tTambah buku");
            System.out.println("4.\tUbah buku");
            System.out.println("5.\tHapus buku");

            System.out.print("\n\nPilihan anda: ");
            option = consoleInput.next();

            switch (option) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    showData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    break;
                case "3":
                    System.out.println("\n===========");
                    System.out.println("TAMBAH BUKU");
                    System.out.println("===========");
                    break;
                case "4":
                    System.out.println("\n=========");
                    System.out.println("UBAH BUKU");
                    System.out.println("=========");
                    break;
                case "5":
                    System.out.println("\n==========");
                    System.out.println("HAPUS BUKU");
                    System.out.println("==========");
                    break;
                default:
                    System.err.println("\nInput tidak ditemukan!");
            }
            isContinue = exitQuestion("Apakah anda ingin melanjutkan");
        }
    }
    
    private static void showData() throws IOException {
        System.out.println("Data akan ditampilkan disini");

        boolean isCreate = exitQuestion("Apakah anda ingin menambah data");
    }

    private static boolean exitQuestion(String message){
        Scanner consoleInput = new Scanner(System.in);
        String option;

        System.out.print("\n"+message+" (y/n)? ");
        option = consoleInput.next();

        while (!option.equalsIgnoreCase("y") && !option.equalsIgnoreCase("n")){
            System.err.println("Silahkan pilih y atau n!");
            System.out.print("\n"+message+" (y/n)? ");
            option = consoleInput.next();
        }
        return option.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try {
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\033\143");
            }
        }catch (Exception exception){
            System.err.println("Tidak dapat clear screen!");
        }
    }
}
