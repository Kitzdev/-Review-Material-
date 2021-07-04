package Dicoding.Datetime.src.com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar
{
    public static void main(String[] args)
    {
        //Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        //Menampilakan waktu sekarang dengan lebih spesifik
        System.out.println("Tanggal: " + calendar.get(Calendar.DATE));
        System.out.println("Bulan: " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun: " + calendar.get(Calendar.YEAR));
    }
}
