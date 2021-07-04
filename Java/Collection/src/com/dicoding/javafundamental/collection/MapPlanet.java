package Dicoding.Collection.src.com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet
{
    public static void main(String[] args)
    {
        //Menggunakan HashMap
        Map<String, Planet> planets = new HashMap<String, Planet>();
        planets.put("key-1", new Planet("Mercury", 0.06)); //Method put() untuk menambahkan objek ke Map
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        planets.put("key-4", new Planet("Mars-X", 0.11));    //Menambahkan ke Map dengan key yang sama

        //Method size() untuk mendapatkan ukuran Set
        System.out.println("Map planet awal: (size = " + planets.size() + ")");
        for(String key : planets.keySet())  //Looping key dari map
        {
            //Method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("key-2");    //Method remove() untuk mengeluarkan objek dari Map

        System.out.println("Map planets akhir: (size = " + planets.size() + ")");
        for(Planet planet : planets.values())   //Looping value dari map
        {
            System.out.println("\t " + planet);
        }
    }
}
