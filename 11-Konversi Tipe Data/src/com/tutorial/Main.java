package com.tutorial;

public class Main {

    public static void main(String[] args) {
        //Type data Integer
        int valueInt = 225;
        System.out.println("value int = " +valueInt);

        //Type data Long
        long valueLong = valueInt;
        System.out.println("value long = " + valueLong);

        //memperbaiki nilai ke rentang lebih kecil (casting/konversi)
        byte valueByte = (byte)valueInt;
        System.out.println("value integer to byte = " + valueByte);
        System.out.println("Max value byte = " + Byte.MAX_VALUE);
        System.out.println("Min value byte = " + Byte.MIN_VALUE);

        //casting pembagian
        //jika ingin otomatis diganti salah satu variable menjadi float
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f \n",a,b,c);

        //cara lainnya
        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f \n",x,y,z);
    }
}
