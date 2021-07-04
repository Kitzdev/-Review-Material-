package Dicoding.PropertiDanMehod.src.com.dicoding.javafundamental.propertimetode;

public class Hewan
{
    double tinggi = 30;
    double berat = 3;

    int umur;

    Hewan(int umur)
    {
        this.umur = umur;
    }

    void lari()
    {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan()
    {
        System.out.println("Berjalan dengan sangat lambat..");
    }

    void makan()
    {
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat()
    {
        return berat;
    }

    double getTinggi()
    {
        return tinggi;
    }

    int getUmur()
    {
        return umur;
    }
}
