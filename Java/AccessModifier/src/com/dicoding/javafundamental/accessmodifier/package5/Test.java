package Dicoding.AccessModifier.src.com.dicoding.javafundamental.accessmodifier.package5;

import java.io.Serializable;

class Test implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //Nilai ini tidak akan dijaga dalam proses serialisasi
    transient int nilaiA;

    //Variabel ini akan dijaga nilainya dalam proses serialisasi
    double nilaiB;
    String nilaiC;

    //synchronized berfungsi untuk membatasi akses ke suatu variable/methods yang hanya boleh dilakukan oleh satu thread
    //ketika ada dua thread yang ingin mengakses sycnchronized variable/methods, maka prosesnya dilakukan bergantian.
    public synchronized void showData()
    {

    }
}