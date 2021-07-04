package Dicoding.Collection.src.com.dicoding.javafundamental.collection;

import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

public class SetPlanet
{
    public static void main(String[] args)
    {
        //Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); //Method add() untuk menambahkan objek ke dalam Set
        planets.add("venus");
        planets.add("earth");   //Menambahkan objek earth beberapa kali
        planets.add("earth");
        planets.add("mars");    //Objek bisa terus ditambahkan ke Set

        //Method size() untuk mendapatkan ukuran Set
        System.out.println("Set planet awal : (size = " + planets.size() + ")");
        for(String planet : planets)
        {
            System.out.println("\t " + planet);
        }

        planets.remove("venus");    //Method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planet akhir : (size = " + planets.size() + ")");
        /*for(Iterator iterator = planets.iterator(); iterator.hasNext();)
        {
            //Looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }*/
    }
}
