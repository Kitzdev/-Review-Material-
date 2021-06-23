package Dicoding.Array.src.com.dicoding.javafundamental.array;

public class DeklarasiInisialisasiArray
{
    public static void main(String[] args) {
        //Deklarasi Array
        double[] arrA;
        arrA = new double[10];

        //Cara pertama
        double[] arrB = new double[10];

        //Cara kedua
        double arrC[] = new double[10];

        //Bisa juga langsung diinisiasi
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6}; //Bisa dipersingkat menjadi int[] arrInt = {1, 2, 3, 4, 5, 6}

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        int[] arrIntA = new int[6];
        arrIntA[0] = 1;
        arrIntA[1] = 2;
        arrIntA[2] = 3;
        arrIntA[3] = 4;
        arrIntA[4] = 5;
        arrIntA[5] = 6;
        arrA[0] = 1;
        arrB[0] = 2;
        arrC[0] = 3;

        for (int x = 0; x < arrIntA.length; x++)
        {
            arrIntA[x] = x + 1;
            System.out.println(arrIntA[x]);
        }
    }
}
