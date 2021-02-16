package com.tutorial;

public class Main {

    public static void main(String[] args) {
        int rows = 5, k = 0, count = 0, count1 = 0;

//        //kotak
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//        System.out.print("\n");
//
//        //segitiga
//        for(int i = 0;i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.print("* ");
//                if(i == j){
//                    break;
//                }
//            }
//            System.out.print("\n");
//        }
//
//        System.out.print("\n");
//        for(int i = 0;i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.print("* ");
//                if((i+j) == 4){
//                    break;
//                }
//            }
//            System.out.print("\n");
//        }
//
//        System.out.print("\n");
//        for(int i = 0;i < 9; i++){
//            for (int j = 0; j < 9; j++){
//                System.out.print("* ");
//                if(i == j){
//                    break;
//                }else if((i+j) == 8){
//                    break;
//                }
//            }
//            System.out.print("\n");
//        }

        //Wajik
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        for(int i = rows; i >= 1; --i) {

            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
