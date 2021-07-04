package Dicoding.Function.src.com.dicoding.javafundamental.propertimetode;

public class Main
{
    public static void main(String[] args)
    {
        Hewan kucing = new Hewan(1);
        kucing.jalan();
        kucing.makan();
        kucing.lari();

        System.out.println("Umurnya adalah " + kucing.getUmur());

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));

        System.out.println("Indeks masa tubunya adalah " + bmi);
    }
}
