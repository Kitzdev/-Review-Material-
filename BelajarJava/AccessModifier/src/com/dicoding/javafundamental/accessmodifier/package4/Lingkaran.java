package Dicoding.AccessModifier.src.com.dicoding.javafundamental.accessmodifier.package4;

//Class dengan tipe final tidak dapat dijadikan induk kelas
final class Lingkaran
{
    //Biasanya final digunakan bersamaan dengan static untuk membentuk suatu konstanta

    static final double phi = 3.14;
    int jari = 7;

    //Method dengan non access modifier final tidak dapat di-override oleh anak kelas
    final double getLuas()
    {
        return jari * jari * phi;
    }
}
