package bangunruang;

import bangundatar.PersegiPanjang;

public class Balok implements Geometri {
    private PersegiPanjang alas;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume() {
        return alas.getLuas() * tinggi;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * (alas.getLuas() + (alas.getPanjang() * tinggi) + (alas.getLebar() * tinggi));
    }
}
