package Dicoding.StrukturDasar.src.com.dicoding.javafundamental.basic;

import java.util.Date;

import Dicoding.StrukturDasar.src.com.dicoding.javafundamental.basic.kendaraaan.Kereta;
import Dicoding.StrukturDasar.src.com.dicoding.javafundamental.basic.kendaraaan.Mobil;
import Dicoding.StrukturDasar.src.com.dicoding.javafundamental.basic.kendaraaan.Motor;
import Dicoding.StrukturDasar.src.com.dicoding.javafundamental.basic.musik.Gitar;

public class Main {
    
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Gitar.bunyi();

        Motor.jumlahban();
        Mobil.jumlahban();
        Kereta.jumlahban();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        //Date tomorrow = DateUtils.addDays(today, 1);
        //System.out.println("Besok = " + tomorrow);
    }
}
