package Dicoding.Inheritance.src.com.dicoding.javafundamental.inheritance;

public class Main
{
    public static void main(String[] args)
    {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Objek --> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan --> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing --> " + (hewan instanceof Kucing));

        System.out.println("---------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan IS-A Objek --> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan --> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing --> " + (kucing instanceof Kucing));

        System.out.println("---------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("---------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("---------------------");

        Hewan h = new Kucing();
        Kucing k = new Kucing();

        //o.makan(); --> error, karena method makan() tidak ada di class object
        h.makan();
        k.makan();

        Hewan hewanK = k;

        //object.makan(); --> error, karena method makan() tidak ada di class object
        hewanK.makan();

        Kucing kucingK = (Kucing) h;
        kucingK.makan();
    }
}
