package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader inputData = new FileReader("input.txt");
        BufferedReader bufferRead = new BufferedReader(inputData);
        bufferRead.mark(200);

        String data = bufferRead.readLine();
        System.out.println(data);
        bufferRead.reset();

        //write file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        String baris = bufferRead.readLine();

        bufferOutput.write(baris, 0, baris.length());
        bufferOutput.flush();
        inputData.close();
        bufferRead.close();
        fileOutput.close();
        bufferOutput.close();
    }
}
