package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        fileInput = new FileInputStream("input.txt");

        int data = fileInput.read();

        while (data != -1){
            System.out.println((char) data);
            data = fileInput.read();
        }

        fileInput.close();

        try {
            fileInput = new FileInputStream("input.txt");
            //create file output
            fileOutput = new FileOutputStream("output.txt");

            int text = fileInput.read();

            while (text != -1){
                fileOutput.write(text);
                text = fileInput.read();
            }
        }finally {
            if(fileInput != null){
                fileInput.close();
            }else if(fileOutput != null){
                fileOutput.close();
            }
        }

        //open and close file using try
        try (FileInputStream inpt = new FileInputStream("input.txt")) {
            try (FileOutputStream out = new FileOutputStream("output2.txt")) {
                int text2 = inpt.read();

                while (text2 != -1) {
                    System.out.println((char) text2);
                    text2 = inpt.read();
                }
            }
        }
    }
}
