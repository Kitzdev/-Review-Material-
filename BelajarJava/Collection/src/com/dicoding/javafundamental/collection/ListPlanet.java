package Dicoding.Collection.src.com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet
{
    public static void main(String[] args)
    {
        //Deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus";   //Error ArrayIndexOutOfBoundsException

        //Menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); //Method add() untuk menambahkan objek ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");    //Objek lainnya masih bisa terus ditambahkan ke list

        System.out.println("List planets awal");
        for(int i = 0; i < planets.size(); i++) //Method size() untuk mendapatkan ukuran List
        {
            //Method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("venus");    //Method remove() untuk mengeluarkan objek dari List

        System.out.println("List planets akhir");
        for(int i = 0; i < planets.size(); i++)
        {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
