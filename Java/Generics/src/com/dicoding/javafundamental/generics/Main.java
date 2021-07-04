package Dicoding.Generics.src.com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> lo = new ArrayList<String>();
        lo.add("lo - String 1");                //lo menampung objek String
        //lo.add(new Planet("Mercury", 0.06));    //lo menampung objek Planet

        for(Object o : lo)
        {
            Planet p = (Planet) o;
            p.print();
        }

        List<Planet> lp = new ArrayList<Planet>();    //List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); //lp menampung objek Planet
        //lp.add("lp - String 1");    //Baris ini compile-error, lp tidak diizinkan menamping objek String

        for (Planet p : lp)
        {
            p.print();
        }

    }
}
