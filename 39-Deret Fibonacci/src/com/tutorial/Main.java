package com.tutorial;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int f_n, f_n_1, f_n_2, n, i;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke - :");
        n = userInput.nextInt();

        i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

//        System.out.println("==== Using Forloop");
//        for(; i <= n;i++){
//            System.out.println("nilai ke - " + i + "adalah " + f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//        }

//        System.out.println("==== Using While");
//        while (i <= n){
//            System.out.println("nilai ke - " + i + " adalah " + f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            i++;
//        }

        System.out.println("==== Using Do While");
        do {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }while (i <= n);
    }
}
