package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream dataInput = new FileInputStream("input.txt");
        //membaca file dengan memory
        BufferedInputStream bufferInput = new BufferedInputStream(dataInput);

        bufferInput.mark(200);
        byte[] data = bufferInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferInput.reset();
        dataInput.close();
        bufferInput.close();

        //menulis data dengan buffered
        FileOutputStream dataOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferOutput = new BufferedOutputStream(dataOutput);

        //menulis data byte
        bufferOutput.write(data, 0, data.length);
        bufferOutput.flush();

        //close
        dataOutput.close();
        bufferOutput.close();

    }
}
